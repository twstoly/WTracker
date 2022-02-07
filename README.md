### Wtracker

###### Author:
##### twstoly

### Project Description
It's An Application that allows rangers to sight animals, record their location and condition if endangered.

### Technologies Used
* Spark
* Gradle
* JUnit
* Java
* POSTGRES

###### SetUp link:

* Clone repository
* Locally in PSQL set up the database as follows;

* CREATE DATABASE wildlife_tracker;
* Connect to the database : \c wildlife_tracker;
* Create the following tables in wildlife_tracker
* CREATE TABLE endangered_animals (id serial PRIMARY KEY, name varchar, health varchar, age varchar);
* CREATE TABLE sightings (id serial PRIMARY KEY, animal_id int, location varchar, ranger_name varchar);
* CREATE TABLE animals (id serial PRIMARY KEY, name varchar, health varchar, age varchar);
* CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;


* In your terminal type "gradle run" inside project directory
* Open a tab in your computer and launch 'http://localhost:4567'


###### Usage
To track and register wild animals

###### BDD
* Get user input depending on choice of form.
* Use submitted data to record details of various wild animals for better organization of these animals situations.
* Enlist the data in well lay easy follow-up way.

###### Known Bugs
none

###### Contributing
Reach out for any addition to the project.


##### License
MIT License [found here](LICENSE) twst.

###### Copyright
@2022










