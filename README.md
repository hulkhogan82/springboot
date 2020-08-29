# Spring Boot

# Build and Execution
   
    mvn clean package
    
    java -jar target/springBoot-0.0.1-SNAPSHOT.jar

# Rest API Urls
    http://localhost:8802/api/v1/greeting

    http://localhost:8802/api/v1/quote
    
    http://localhost:8080/flights/departures
    
    http://localhost:8080/flights/departures/JFK
    
    http://localhost:8080/flights/departure/QR3957

# Swagger
    http://localhost:8080/swagger-ui.html
    
# DATABASE
    H2 IN MEMORY: http://localhost:8080/h2-console
    DATA.SQL AND SCHEMA.SQL used.    
    
# Issues

    Plugin Error
    
    The following method did not exist: 'org.springframework.plugin.core.PluginRegistry org.springframework.plugin.core.PluginRegistry.of(java.util.List)'
    
    https://stackoverflow.com/questions/60710084/the-following-method-did-not-exist-org-springframework-plugin-core-pluginregis