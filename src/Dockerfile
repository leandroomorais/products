FROM eclipse-temurin:21

ENV PROJECT_PATH="products"
ENV TARGET_JAR="products-0.0.1-SNAPSHOT.jar"
COPY ./target/$TARGET_JAR ./$TARGET_JAR

ENTRYPOINT java \
  -jar ./$TARGET_JAR