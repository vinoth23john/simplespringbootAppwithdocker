FROM openjdk:8-jdk-alpine as builder
#RUN apk update && apk add ca-certificates && rm -rf /var/cache/apk/*
#COPY ./server.crt /usr/local/share/ca-certificates/mycert.crt
#RUN update-ca-certificates

RUN mkdir  -p /app/source
COPY . /app/source
WORKDIR /app/source

RUN ./mvnw clean package



FROM openjdk:8-jdk-alpine as runtime
COPY  --from=builder  /app/source/target/*.jar /app/app.jar

EXPOSE 8080

ENTRYPOINT ["java","-Djava.security.egd=file/dev/./urandom", "-jar","/app/app.jar"]