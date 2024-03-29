# CodeCoolElProjecteGrande
![Contributors](https://img.shields.io/badge/-_Contributors-red.svg?logo=github&style=for-the-badge)

[![Földi Krizsán Ildikó](https://img.shields.io/badge/F%C3%B6ldi%20Krizs%C3%A1n%20Ildik%C3%B3-blue.svg?logo=github)](https://github.com/FoldiKrizsanIldiko)

![LinkedIn](https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555)

[![Static Badge](https://img.shields.io/badge/-_%20F%C3%B6ldi%20Krizs%C3%A1n%20Ildik%C3%B3-grey.svg?logo=linkedin&colorB=555)](https://www.linkedin.com/in/ildiko-foldi-krizsan/)

<br />
<div align="center">
     <img src="src/public/logo.png" alt="Logo">
<h3 align="center">Offer Oasis Test Project</h3>
  <p align="center">
This project is for testing functionality of Offer Oasis webpage
</p>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>


## About The Project

<p>
Offer Oasis is webshop application developed by students of Codecool. The project focuses on imitating a fully functional webshop.
This project was created to test the functionality of Offer Oasis website. 

It was a team work from tester side, and a collaboration with the developer team. 
It helped to practice assertive communication.
-ketten dolgoztunk rajta
-együtt kellett dolgozni a frontend fejlesztőkkel
-Agil scrum - meg kellene említeni
-a user story írása közben felmerültek olyan igények amiket később még le kell fejleszteni

a tesztek Gherkin nyelven íródtak
Cucumber futtassa at teszteket,és Selenium ami kezeli az oldalt...
az oldalakhoz Page Factory metódust használtunk.

</p>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Built With

* ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
* ![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
* ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
* ![Selenium](https://img.shields.io/badge/-selenium-%43B02A?style=for-the-badge&logo=selenium&logoColor=white)
* ![Google Chrome](https://img.shields.io/badge/Google%20Chrome-4285F4?style=for-the-badge&logo=GoogleChrome&logoColor=white)
* cucumber
<p align="right">(<a href="#readme-top">back to top</a>)</p>


## Getting Started

Please follow next steps to run the tests.

### Installation

1. Mivel csak lokálisan futtatható a weblap, ezért először le kell klónozni a OfferOasist. A beindításához részletes leírást találsz a projekt readme filehoz
2. Clone this repository:
```sh
   git clone https://github.com/FoldiKrizsanIldiko/OfferOasisTest-BDD.git
   ```
3. install maven
4download it from here : https://maven.apache.org/download.cgi
5. follow the instructions from this page: https://maven.apache.org/install.html



<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Usage
6. a. run tests with
```
mvn test
```
or run tests one by one by declaring specify test
```
mvn test -Dtest=src/test/resources/com.codecool.the_recruitables.offer_oasis_tests/login.feature<change this with another test class>
```
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!ezt ellenőrizd!!!!!!!!!!!!!!!!!!!!!
6. b. If you have installed the IntelliJ you can open project in it
In resources file, under com.codecool.the_recruitables.offer_oasis_tests you will find the .features files.
You can run tests by pressing the ![img.png](img.png) arrow next to Feture or next to Scenario. The Feature will run all the Scenarios in the feature.

7. The Selenium will open new page in Chrome browser, open the Offer Oasis webshop page, and simulate actions described in Scenario.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Contact

Project
Link: [https://https://github.com/FoldiKrizsanIldiko/SeleniumEasyTest3SI](https://github.com/FoldiKrizsanIldiko/OfferOasisTest-BDD)

<p align="right">(<a href="#readme-top">back to top</a>)</p>