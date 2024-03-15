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

#### 5.	Module Design (LLD) : 
The detailed internal design for all the system modules is specified. The unit tests are essential part of any development process and helps eliminate the maximum faults and errors at a very early stage. 

  “Unit Test can be designed and documented during this stage. (Technical Specification Document).”

#### 6.	Coding phase : 
  Best suitable programming language is decided based on the system and architectural Requirements.

#### 7.	Unit testing : 
  Code level and at early unit testing is the testing that helps eliminate the bugs in this stage.

#### 8.	Integration testing : 
  Integration testing is performed to test the coexistence and communication of the internal modules within the system.

#### 9.	System Testing : 
  In this stage purely manual Testers can involve to test functionality of the application.

#### 10.	Acceptance Testing : 
  Acceptance testing is associated with the business requirement analysis phase and involves testing the product in user requirement.

#### Advantages of V-Model :

1. Simple and easy to understand and use.
2. Testing activities like planning, Test designing happens well before the coding. This saves a lot of time.
3. Proactive defect tracking - that is defects are found at early stage.
4. This is highly disciplined model and phases are completed one at a time.
5. Works well for smaller projects where requirements are much understood.
6. Easy to manage due to the rigidity of the model, each phase has specific deliverables and review process.

##### Disadvantages of V-Model :
1. High Risk and uncertainty.
2. Not a good Model for complex and object-oriented projects.
3. Poor model for long and on-going projects
4. Not suitable for the projects where requirements are at a moderate to high Risk of changing.
5. Once the application is in testing stage it is difficult to go back and change the functionality.
6. No working software is produced until late during the life cycle.
7. Software is developed during the implementation phase (development phase), so no early prototypes of the software are produced.
8. If any changes happen in mid-way, then the test documents along with the requirements document has to be updated.

### When to use the V-Model :

1. The V-shaped model should be used for small to medium sized projects where -Requirements documents are clearly defined and fixed.

2. The V-shaped model should be chosen when ample (Plenty or Sufficient) technical resources are available with needed technical expertise.


### 3. Prototype Model : (evaluate new design)

<div align="center">
  <img src="https://github.com/sudhakarsdk98/SDET/assets/161011127/4dc4b099-8732-414b-adee-c914650df821" height="250" alt="Prototype Model" />
  <img width="150" />
</div>

  Prototype methodology is defined as software development model in which a prototype is built, test and then reworked when needed until an acceptable Prototype is achieved. It's also creating a base to produce the final system. Software prototyping model works best in scenarios where the projects requirements are not known. It is an iterative, trial, and error method which take place between the developer and client.

#### Step 1: Requirements gathering and Analysis :
  A prototype model starts with requirement analysis. In this phase the requirements of the system are defined in detail. During the process users of the system are interviewed to know their expectations from the system.

#### Step 2: Quick Design : 
  In this second phase is a preliminary design or a quick design. In this stage a simple design of the system is created. However, it is not a complete design. It gives a brief design helps in developing Prototype.

#### Step 3: Build Prototype :
  In this phase an actual prototype is designed based on the information gathered from quick design. It is a small working model of the required system.

#### Step 4: Initial User or Customer Evaluation :
  In this stage the proposed system is presented to the client for an initial customer evaluation. It helps to find out the strength and weakness of the working model. Comments and suggestions are collected from the customer and provided to the developer.

#### Step 5: Refining Prototype :
  If the User is not happy with the current Prototype, you need to refine the Prototype according to the user’s feedback and suggestions. 
This phase will not over until all the requirements specified by the users are met. Once the User is satisfied with the developed Prototype a final system is developed based on approved the final prototype.

#### Step 6: Implement product and maintenance :
Once the final system is developed based on the final Prototype, it is thoroughly tested and deployed to the production. The system undergoes routine maintenance for minimising down time and prevent large scale fails.

#### Advantages of prototype :
  1. Users are actively involved in the development.
  2. Since in this methodology a working Model of the system is provided, the users get a better understanding of the system being developed.

#### Disadvantages :
  1. Practically this methodology may increase the complexity of the system as scope of the system may expand beyond original plans.

#### When to use the prototype model :
  Prototype model should be used when described system needs to have lot of interactions with end users

