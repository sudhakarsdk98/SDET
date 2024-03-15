# Manual Testing

  _Manual Testing is a type of software testing; it is the process of executing an application with the intention of finding defects by comparing the output behaviour of the application with the expected behaviour (requirements)._

## Why Software Testing?

Software testing is to point out the defects and errors that were made during the development phase.

## Why Software has defects?
1. Incorrect requirements.
2. Wrong design.
3. Poor coding.
4. Complex business logic.
5. Complex technologies.
6. Work pressure.
7. Frequent CR's (change requests).

## Benefits of Software Testing

> Software testing helps in finalising the software application against business requirements.

### Benefits:
1. Finding the defects before delivery.
2. Gains confidence in quality.
3. Prevents defects.
4. Ensures the requirements are delivered to the client.
5. To gain application knowledge or become a subject matter expert.
6. It helps to gain domain knowledge.

+ ####  Quality: 
  Software quality is nothing but delivering the product with a bug-free application on time and meeting all requirements.
+ ####  Defect/Issue:
  *"Interms of requirements"*  A defect is a deviation or mismatch of requirements.
+ ####  Error/Bug:
  *"Interms of coding logic"*  Any incorrect human action that produces a problem in the system is called an error, and an error found during the testing phase is called a bug.
+ ####  Failure:
  The deviation or mismatch identified by the end user while using the system is called a failure.

#### Project vs Product

  *A project is developed for a single customer based on their own requirements by the software company; the project will be used by the customer only.* Ex: Any banking application. 

  *A product is developed for multiple customers on a consolidated set of requirements by a software company; the product is used by various customers.* Ex: Google, Facebook.

#### Program:

  *A set of lines of code LOC (or) set of methods (or) set of functions (or) set of instructions is called a program.*

#### Module/Component:
  *A set of programs is called a module or component.*

#### Application/Build:
  *A set of modules or components to form an executable (.exe) file is called an application or build.*

### CMMI - "Capability Maturity Model Integration" is a standard organisational model/process.
#### Levels of CMMI:
  1. Initiation.
  2. Defined.
  3. Managed.
  4. Quantitatively Managed.
  5. Optimizing.

# SDLC
*Software development life cycle is a process followed for a software project in a software organisation. It consists of a detailed plan with a description of how to develop, maintain, replace, alter, or enhance specific software.*

## Phases of SDLC :
  1. Initial.
  2. Analysis.
  3. Design.
  4. Coding.
  5. Testing.
  6. Delivery & Maintenance.

### Why SDLC ?
  > SDLC ensures success in the process of software development.
### 1. Initial : 
  Business requirements are gathered in this phase. The main focus is a kick-off meeting of the project manager and stakeholders, meeting with managers, stakeholders, and users in order to determine the requirements like:
  + Who is going to use the system ?
  + How will they use the system?
  + What data should be input into the system ?
  + What data should be output by the system ?

 **Roles :** Business analyst and system architect.

 **Outcomes :** SRS (System Requirements specification) / BRS (Business Requirement Specification) / CRS (Customer Requirement specification) / URS (User Requirement Specification) document / BRD (Business Requirement Document).

### 2. Analysis :
  After requirement gathering, those requirements are analysed for their validity and the possibility of developing the requirements in the system.
  
**Roles :** System Architect or Sr. Analyst

**Outcome :** RAD (Requirement Analysis document).

### 3. Design :
  During this part of the design phase, the consultants/ Architects break down the system requirements into pieces.
  System Design helps in specifying hardware and software requirements and also helps in defining the overall system architecture. These system design specifications serve as input for the next phase of the model.

In this phase designers can create 2 documents like below :
 + HLD’s (High Level Design Document).
 + LLD’s (Low Level Design Document).

-	HLD's consist of main modules of the project from root to leaf and multiple LLD'S.

-	LLD's consist of sub modules of main modules along with the data flow diagrams, ER diagram etc. prepared by technical support or designers called internal designers.

**Roles :** Architects & Team.

**Outcome :** Technical Design document (TDD).

### 4. Coding :
  The actual development starts and the product is built in coding phase. The work is divided in modules then into units where actual coding is started in this coding phase. It is mainly focused by developers. Coding phase is the longest phase of SDLC.

**Roles :** Developers and architect team.

**Outcome :** programs, modules, applications.

### 5. Testing :
  In this phase the testers execute the test cases (TC's) against the application and reports the defects and retest the fixed defects.
  During this phase unit testing, integration testing, system testing and acceptance testing are done.
  
**Roles :** Testers and developers

**Outcome :** Test Plan, Test Case's document, defects and Test Summary Report (TSR).

### 6. Delivery and Maintenance :
  After successful testing the product is delivered / the code is deployed, during the delivery phase. The Customer will perform UAT (User Acceptance Testing) in real time environment (Production Environment). Once the customers start using the developed system then the actual problems and needs should be solved from time to time. The process where the care is taken for the developed product is known as Maintenance.

**Roles :** Testers, Developers, Customers, Business team, Architects, Project Manager and Delivery Manager.

**Outcome :** Quality Product, Enhancements and production issues (Maintenance).

## SDLC Models

  1. Waterfall Model.
  2. V Model.
  3. Prototype Model.
  4. Iterative - Incremental Model.
  5. Spiral Model.
  6. Big Bang Model.
  7. Agile Model.

### 1. Waterfall Model.

<div align="center">
  <img src="https://github.com/sudhakarsdk98/SDET/assets/161011127/9cebe5cd-9783-421c-8d2b-b61fb7471f22" height="400" alt="Waterfall Model" />
  <img width="200" />
</div>

  WFM is a linear application development model that uses rigid phases; When one phase ends, the next begins.
  It was the first process model to be introduced in Software Industry. Also referred to as a linear sequential life cycle model. It is very simple to understand and use. This type of model is basically used for the project which is small and there are no uncertain Requirements.

#### Advantages :

- This model is simple, easy to understand and use.
- It is easy to manage due to rigidity (Inflexibility) of the model.
- In this model, phases are processed and completed one at a time.

#### Disadvantages :

- Once an application is in testing stage, it is very difficult to go back and change.
- No working software is produced until late during the life cycle.
- High amount of risks.
- Not a good Model for complex and object-oriented projects.
- it is a poor model for long and on-going projects.

#### When to use the WFM :
1. This model is used only when requirements are very well known, Clear and fixed.
2. This project is short.


### 2. V Model :

<div align="center">
  <img src="https://github.com/sudhakarsdk98/SDET/assets/161011127/1d925bc3-0f0d-4e96-bef4-d3e11b5c12b2" height="450" alt="V Model 1" />
  <img width="250" />
</div>

#### Dev vs Test activities :

<div align="center">
  <img src="https://github.com/sudhakarsdk98/SDET/assets/161011127/1af19c23-7157-48f4-9017-99ecbaaf4b65" height="380" alt="V Model 2" />
  <img width="180" />
</div>

#### Refinement form of V-MODEL: (When CR’s are introduced, we can implement Refinement of V-Model).

<div align="center">
  <img src="https://github.com/sudhakarsdk98/SDET/assets/161011127/abdad40a-d306-470b-9b96-4d1461a051fd" height="380" alt="V Model 3" />
  <img width="180" />
</div>

> This Model is a SDLC model where execution of the process happens in sequential manner in V-shape. Each phase must be completed before the test phase begins. Testing of the product is planned in parallel with a corresponding phase of development.

<div align="center">
  <img src="https://github.com/sudhakarsdk98/SDET/assets/161011127/6caf55ad-a94d-4f64-9872-b25a604a2adf" height="80" alt="Software Testing = Verification + Validation" />
  <img width="100" />
</div>

#### Verification :
  _It is a process of verifying, “Are we building the product right?”. This is also known as static testing._

#### Validation :
  _It is a process of validating, “Are we building the right product?”. It is also called as dynamic testing._

### Phases of V-Model:
#### 1.	Information and gathering stage:
   In this stage BA (Business Analyst) studies the requirements of the client / customer and prepares the BRS (Business Requirement Specification) documents.

#### 2.	Analysis : 
  In this stage Sr. Analyst prepares S/w Req. Spec. (Software Requirement specification) document with respect to the corresponding BRS document. This document consists of two sub documents i.e, SRS (System Requirements Specification) & FRS (Functional Requirements Specification).

  -	SRS contains details about software and hardware requirement.
  -	FRS contains details about the functionality to be used in the project.
  -	BRS: Involves detailed communication with the customer to understand his expectations and exact requirements.

  “The Acceptance test design planning is done at this stage as business requirements can be used as input for acceptance testing.”

#### 3.	System Design : 
  The system design will have the understanding and detailing of the complete hardware and communication setup for the product under development. 

  “The system test plan is developed based on the system design.”

#### 4.	Architectural Design (HLD) : 
  The system design is broken down further into modules taking up different functionality. The data transfer and communication between the internal modules and with the outside world (other systems) is clearly understood and defined. 
  
  “Integration tests can be designed and documented during this stage.”

  



