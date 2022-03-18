# deosn't work
FROM openjdk:17
COPY journal/gradle ./gradle
COPY journal/gradlew journal/build.gradle journal/settings.gradle .
COPY journal/src ./src
CMD ./gradlew bootRun