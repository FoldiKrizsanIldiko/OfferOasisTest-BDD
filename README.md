#

![Contributors](https://img.shields.io/badge/-_Contributors-red.svg?logo=github&style=for-the-badge)

[![Földi Krizsán Ildikó](https://img.shields.io/badge/F%C3%B6ldi%20Krizs%C3%A1n%20Ildik%C3%B3-blue.svg?logo=github)](https://github.com/FoldiKrizsanIldiko)
[![Balázs Oltvölgyi](https://img.shields.io/badge/Bal%C3%A1zs%20Oltv%C3%B6lgyi-blue.svg?logo=github)](https://github.com/balazs-oltvolgyi)

![LinkedIn](https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555)

[![Static Badge](https://img.shields.io/badge/-_%20F%C3%B6ldi%20Krizs%C3%A1n%20Ildik%C3%B3-grey.svg?logo=linkedin&colorB=555)](https://www.linkedin.com/in/ildiko-foldi-krizsan/)
[![Static Badge](https://img.shields.io/badge/-_Bal%C3%A1zs%20Oltv%C3%B6lgyi-grey.svg?logo=linkedin&colorB=555)](https://www.linkedin.com/in/balazs-o/)


<br />
<div align="center">
    <img src="OfferOasisTests/public/img_1.png" alt="Logo">
<h1 align="center">Offer Oasis Test Project</h1>
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
Offer Oasis is a webshop application developed by students of Codecool, meticulously crafted to imitate a fully functional webshop.
This collaborative project involved both testing and development teams, fostering assertive communication and Agile Scrum methodologies. 
Working closely with frontend developers, we tackled user stories, identifying needs for future enhancements. 
Our tests, scripted in Gherkin, were executed using Cucumber and Selenium, with Page Factory methods for page management.
Explore our project  <a href="https://docs.google.com/presentation/d/1BIPeVZzc3X9EU8VHsQtCdl92S0v3CvdJF8a3Ku0Tt1I/edit#slide=id.g13ef5196189_4_0" style="color: yellowgreen; font-size: 20px"> presentation slides </a> 
and view the <a href="https://youtu.be/Pm8aobQdhHw" style="color: yellowgreen; font-size: 20px"> video showcasing </a>test executions 

</p>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Built With

* ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
* ![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
* ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
* ![Selenium](https://img.shields.io/badge/-selenium-%43B02A?style=for-the-badge&logo=selenium&logoColor=white)
* ![Google Chrome](https://img.shields.io/badge/Google%20Chrome-4285F4?style=for-the-badge&logo=GoogleChrome&logoColor=white)
* ![Cucumber](https://img.shields.io/badge/Cucumber-23C552?style=for-the-badge&logo=Cucumber&logoColor=white)
<p align="right">(<a href="#readme-top">back to top</a>)</p>


## Getting Started

Please follow next steps to run the tests.

### Installation

1. Since the webpage can only be run locally, you need to first clone <a href="https://github.com/balazs-oltvolgyi/CodeCoolElProjecteGrande">OfferOasis</a>. For instructions on how to start it, refer to the detailed description in the project's readme file.
2. install maven
   download it from here : https://maven.apache.org/download.cgi
3. follow the instructions from this page: https://maven.apache.org/install.html
4. Clone this repository:
```sh
   git clone https://github.com/FoldiKrizsanIldiko/OfferOasisTest-BDD.git
   ```
5. To navigate into the folder, use the following command:
```
cd <folder where you cloned the repository>
```
   


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
You can run tests by pressing the ![img.png](OfferOasisTests/public/img.png) arrow next to Feture or next to Scenario. The Feature will run all the Scenarios in the feature.

7. The Selenium will open new page in Chrome browser, open the Offer Oasis webshop page, and simulate actions described in Scenario.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Contact

Project
Link: [https://https://github.com/FoldiKrizsanIldiko/SeleniumEasyTest3SI](https://github.com/FoldiKrizsanIldiko/OfferOasisTest-BDD)

<p align="right">(<a href="#readme-top">back to top</a>)</p>