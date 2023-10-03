Feature: Flujo de Reserva

  Scenario: Reserva de Alojamiento en Booking.com
    Given Me encuentro en dentro de la apk de Booking.com
    When Ingreso CUSCO en el campo destino y selecciono las fechas
    And Selecciono 1 habitación, 2 adultos y 1 niño de 5 años
    And Selecciono el segundo resultado de búsqueda
    And Elijo una habitación disponible y hago clic en “Selec Rooms”
    And Completo los datos personales para la reserva
    And Hago click en “Next Step”
    Then Verifico los datos de la reserva sean los correctos
    When hago clic en "Final Step"




