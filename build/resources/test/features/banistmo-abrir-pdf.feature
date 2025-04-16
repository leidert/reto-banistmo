Feature: banismo website

#  ingresar a la pagina web de banismo-
#  aceptamos los cokies-
#  Click en aprender es facil-
#  clik en boton legales legales-
#  click en el boton conoce mas de FATCA
#  click en descargar pdf
  Scenario: download the pdf in de wed site to banistmo
    Given go in the web site to banistmo and go to click on de cockies button
    When we click on the button Aprender es facil
    And  we click on the button conocer mas in legales
    And we click on the button conocer mas in the FATCA
    And click on the pdf download
    Then pdf validate