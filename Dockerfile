# 1. Aşama: Java 21 çalışma ortamı (Sürümü 21 yaptık)
FROM eclipse-temurin:21-jdk-jammy

# 2. Aşama: Uygulama klasörü
WORKDIR /app
COPY target/*.jar app.jar

# 3. Aşama: Başlatma talimatı
EXPOSE 8080
ENTRYPOINT ["java", "-Xmx512m", "-Dserver.port=8080", "-jar", "app.jar"]