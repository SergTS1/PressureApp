package com.sergey.zakirov.pressure_app_rest.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(title = "Zakirov - PressureApp", description = "Документация Rest Api", version = "1.0",
        contact = @Contact(name = "My self",
                            email = "myEmail.com",
                            url = "someUrlHere")
        )
)
public class OpenApiConfig {
}
