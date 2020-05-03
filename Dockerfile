FROM openjdk:8
ADD target/calc.jar calc.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","calc.jar"]