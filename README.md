# Proyecto Base Programación para Testing

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Este repositorio contiene unos ejemplos básicos sobre POO enfocado en Herencia, Clases Abstractas, Interfaces y Pruebas Unitarias. Adicional a esto, para el ejercicio se manipulan Arraylist y Map para practicidad del manejo de información y por ser tipos de datos a usar en un futuro en proyectos de Automatización.


## Contenido

- Capa Herencia
- Capa Clases Abstractas
- Capa Interfaces
- Capa Test


## Capa Herencia

Se trabaja con la clase **Persona** como clase Padre y la clase **Paciente** y **Medico** como clase hijas que heredan atributos y métodos de **Persona**. Por tal motivo al ejecutar la clase Main de este paquete, esta muestra la misma información a nivel de métodos pues no son sobreescritos.

## Capa Clases Abstractas

En esta capa la clase **Persona** se convierte en *clase abstracta* haciendo uno de sus metodos abstracto tambien. El objetivo, buscar heredar de esta pero permitir a la clase **Paciente** y **Medico** sobreescribir este método abstracto para que realice algo particular según la necesidad de cada clase.

## Capa Interfaces

En esta capa se crean 2 interfaces. La interfaz **Clinica** y la interfaz **Farmacia**. Estas 2 permiten explicar el concepto de abstracción a más bajo nivel, utilizando la clase **Persona** (clase abstracta) como intermediaria para la sobreescritura de todos los métodos de la interfaz **Clinica**, pero a su vez con  la interfaz **Farmacia** se implementa directamente sobre las clases **Paciente** y clase **Medico** para sobrescribir directamente sobre las mismas. Con esto se muestran diferentes formas de usarlas y a su vez que se puede heredar e implementar a la vez ya que no son excluyentes.

## Capa Pruebas Unitarias
En esta capa se crean 3 pruebas unitarias básicas relacionadas con las las clases **Paciente** y **Médico** de la capa de **Herencia**. Allí se validan 2 metodos de la clase Paciente y 1 método de la clase Medico con el fin de ver si estructura básica. *(Explicado con TDD en la sesión).*


**Happy Coding!**

***Juan de Jesús Fernández Graciano***
