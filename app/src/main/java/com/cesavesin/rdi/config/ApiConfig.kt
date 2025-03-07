package com.edisas.rdi.config

object ApiConfig {
    var BASE_URL: String = "https://prawn-cunning-koala.ngrok-free.app/"  // Cambia esto cuando sea necesario

    fun getEndpoint(endpoint: String): String {
        return BASE_URL + endpoint
    }
}
