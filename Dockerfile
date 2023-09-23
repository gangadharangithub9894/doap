FROM  eclipse-temurin:17
COPY target/dockapp.jar dockapp.jar
CMD ["java","-jar","dockapp.jar"]
