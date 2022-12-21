@ComputerPage
Feature: computer Test
  As a user I want to login into nop commerce website

  Scenario: verify User Should Navigate To Computer Page Successfully
    Given I am on homepage
    When I click on Computers tab
    Then I should be navigated to computer page successfully

  @sanity
  Scenario: verify User Should Navigate To Desktops Page Successfully
    Given I am on homepage
    When I click on Computers tab
    And  I click on desktops link
    Then I should be navigated to desktop page


  Scenario Outline:  Verify that user should build you own computer and add them to cart successfully
    Given           I am on homepage
    When            I click on Computers tab
    And             I click on desktops link
    And             I select desktop product Build your own computer
    And             I select processor "<Processor>"
    And             I select ram "<RAM>"
    And             I select hdd "<HDD>"
    And             I select os "<OS>"
    And             I select software "<Software>"
    And             I click on add to cart button
    Then            I should see product has been added to your shopping cart confirmation message

    Examples:
      | Processor                                       | RAM           | HDD               | OS                      | Software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |