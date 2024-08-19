Feature :TalenTEK signup feature;

  @test
  Scenario: student at TalenTek Homepage
    Given student click on create new account button
    And student enter their first name
    And  student enter their last name
    And student enter their email address
    And student enter their password
    And student confirm their password
    And student select their date of birth month
    And student select their date of birth day
    And select their date of birth year
    And student select their gender
    And student agree to terms and condition
    When  student click on Create my account
    Then student should successfully create their student account