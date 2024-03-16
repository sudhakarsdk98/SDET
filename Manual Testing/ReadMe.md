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


### 4. Iterative Model : (Iterative incremental Model)

<div align="center">
  <img src="https://github.com/sudhakarsdk98/SDET/assets/161011127/d9451e72-abd0-4424-b2f3-ca479cac444c" height="350" alt="Iterative Model" />
  <img width="200" />
  <img width="500" />
  <img width="500" />
</div>

#### Mathematical Iterative Incremental Model :

<div align="center">
  <img src="https://github.com/sudhakarsdk98/SDET/assets/161011127/ff35de0b-5eda-4cf2-8d54-85e09119f08f" height="350" alt="Iterative Model 2" />
  <img width="200" />
</div>


  Iterative process starts with a simple implementation of small set of the software requirements and iteratively enhances the evolving versions until the complete system is implemented and ready to be deployed. The basic idea behind this method is to develop a system through repeated cycles (iterative) and in smaller portions at a time (increment).

  An iterative life cycle model doesn't attempt to start with a full specification of requirements. Instead, development begins by specifying and implementing just part of the software, which can then be reviewed in order to identify further requirements. This process is then repeated, producing a new version of the software for each cycle of the model.
Consider an iterative life cycle model which consists of repeating the following 4 phases in sequence:
1) Requirement phase.
2) Design phase.
3) Implementation & Test phase.
4) Review Phase.

#### 1. Requirement Phase :
In which the requirements for the software are gathered and analysed. Iteration should eventually result in a requirement phase that produces a complete and final specification of requirements.

#### 2. Design Phase :
In which a software solution to meet the requirements are designed. This may be a new design or an extension of earlier design.

#### 3. Implementation and Test phase :
When the Software or Application or Build is coded, integrated and tested.

#### 4. Review Phase :
In which the Software is evaluated, the current requirements are reviewed, changes and additions to requirements proposed.

#### Advantages :
1. Generates working software quickly and early during the software life cycle.
2. More flexible-less costly to change scope and requirements.
3. Easier to test and debugging during a small iteration. 
4. Easier to manage risk because risky pieces are identified and handled during its iteration.
5. Each iteration is easily managed milestone.
6. Results are obtained early and periodically.
7. Parallel development can be planned.
8. Progress can be measured.

#### Disadvantages :
1. Each phase of an iteration is rigid and do not overlap each other.
2. Problems may arise pertaining to system architecture because not all requirements are gathered upfront for entire software life cycle.
3. More management attention is required.
4. It's not suitable for smaller projects.
5. Management complexity is more.
6. End of the project may not be known which a risk is.
7. Highly skilled resources are required for risk analysis.
8. Defining increments may require definition of the complete system.


### 5. Spiral Model :

<div align="center">
  <img src="https://github.com/sudhakarsdk98/SDET/assets/161011127/f742691f-2eeb-494b-a955-79a76b0e0c0f" height="250" alt="Spiral Model" />
  <img width="150" />
</div>

The spiral model is a combination of the iterative development process model and the linear sequential development model. It allows incremental releases of the product or incremental refinement through each iteration around the spiral.

#### Phases :
1. Identification
2. Design
3. Construct or build
4. Evaluation and Risk analysis

#### Identification:
It starts with gathering the business requirements in the baseline spiral. In the subsequent spirals as the product matures, identification of the system requirements, subsystem requirements, and unit requirements is all done in this phase.

#### Design :
Starts with the conceptual design in the baseline spiral and involves architectural design, logical design of modules, physical product design and the final design in the subsequent spirals.

#### Construct and Build :
The construct phase refers to production of the actual software product at every spiral in the baseline spiral, when the product is just thought of the design is being developed a POC (proof of concept). It is developed in this phase to get the customer feedback, then in the subsequent spirals with high clarity on requirements and design details a working model of the software called 'Build' is produced with a version number.

#### Evaluation and Risk analysis :
Risk analysis includes identifying, estimating and monitoring the technical feasibility and management risks such as schedule slippage and cost overcome after testing the build at the end of first iteration. The customer evaluates the software and provides feedback.

#### Advantages :
- CR’s (changing requirements) are can be accommodated.
- Requirements can be captured more accurately.
- Users see the system early.
- Development can be divided into smaller parts and the risky parts can be developed earlier which helps in better risk management.

#### Disadvantages :
- Management is more complex.
- End of the project may not be known early.
- Not suitable for small or low risk projects and could be expensive for smaller projects.
- Process is complex
- Spiral may go on indefinitely.
- Large number of intermediate stages requires excessive documentation.


### 6. Big Bang Model :

  It is an SDLC model where we don't follow any specific process. The development just starts with the required money and efforts as the input and the output is the software developed which may or may not be as per customer requirement. Even the customer is not sure about what exactly he wants and the requirements are implemented on the fly without much analysis.

#### Design and application :
  The Big Bang model comprises of focusing all the possible resources in the software development and coding with very little or no planning. The requirements are understood and implemented as they come. Any changes required may or may not need to revamp the complete software.

#### Advantages :
- This is very simple model.
- Little or no planning.
- Required easy to manage
- Very few resources are required
- Gives flexibility to developers.
- It is a good learning aid for new comers and students.

#### Disadvantages :
- Very risk and uncertainty
- It is Not a good model for complex and object-oriented projects.
- Poor model for long and on-going projects. 	
- Can turn out to be very expensive if requirements are misunderstood.

### 7. Agile Model :

<div align="center">
  <img src="https://github.com/sudhakarsdk98/SDET/assets/161011127/ccca748f-5f56-4d70-b280-483330cccb56" height="400" alt="Agile Model" />
  <img width="200" />
</div>

#### Principles of agile testing :

#### 1. Provides Continuous feedback :

  This is needed for the person leading the team and to improve their ability and to motivate them, feedback is necessary where they will know their feedback and can work on it.

#### 2. Delivery value to customer :

Acceptance of tests helps all understanding of what it means on the realisation of customer needs.

#### 3. Enable face to face communication :

  Here testers play a major role in bringing the customer and testers together on a face-to-face communication where by them the problem can be solved regarding the bug and software. A tester can be the ones who physically brings these people together as well the ones who drives the common language between these parties.

#### 4. Self-Organize :

In true agile team everyone has the role to act as a tester. They should know how to shift the focus from time to time when needed. They have to focus their attention towards verifying DONE attitude rather than DONE DONE attitude.

#### 5. Focus on people : 
Testers are basically at the bottom of the line in the non-agile software team; to them, the works are given particular time to complete, and the programmers look like those lower to them.

#### 6. Keep it simple :
Testers can help the customers to understand how to prominently deliver value. They have to provide an equal balance of iterative testing just a right confidence to deliver the software.

### Scrum :

Development divides into several phases. Each of the results is into a ready-to-use product. At the end of each step (called sprint in Scrum terminology) a ready product is delivered to a customer.

“Scrum is a framework within which people can address complex adoptive problems while productively and creatively to deliver of the highest possible value.”

Before we continue the Scrum, we should talk about the core roles involved in to the process.

> - PO (Product Owner): he takes care of the end users interests and determines the importance of the proper user story.

> - SM (Scrum Master): He should coordinate the whole process. Another task is to make sure that scrum is used in proper way. He is also holding the scrum meeting.
  SM is also called as “Servant Leader” or “Team Leader” or “Agile Coach” or “Facilitator”.

> - DEV Team: Develops the product, it maintains tasks are programming, analysis, testing etc and defines the appropriate labour costs. 

<div align="center">
  <img src="https://github.com/sudhakarsdk98/SDET/assets/161011127/b9cbefcd-905f-4cb4-8c9b-83bfb70a3fac" height="80" alt="Scrum Team = PO + SM + DEV Team." />
  <img width="100" />
</div>

#### Standards process in Rally: (What is the Rally – It is a one of the test management and defect tracking tool).

<div align="center">
  <img src="https://github.com/sudhakarsdk98/SDET/assets/161011127/74541552-b3fb-4fc2-aa54-6ebfab76b654" height="300" alt="Rally Process" />
  <img width="100" />
</div>

#### Roles & Responsibilities in agile :

#### SM (Scrum Master) : 
  A SM is team leader and facilitator who help the team members to follow agile practices so that they can meet their commitments. The SM responsibilities are as follows.
- To enable close co-operation between all roles and functions.
- To remove any road blockers or impediments.
- To shield the team from any disturbances.
- To work with the organization to track progress and processes of the company.
- To ensure the agile inspect and adopt processes are leveraged properly which includes Daily stand-up’s, planned meetings, demo, review, retrospective meetings and to facilitate team meetings and decision-making progress.

#### PO (Product Owner) :
  A PO is one who drives the product from business perspective. The PO responsibilities are as follows.
- To define the requirements and prioritise their values.
- To determine the release date contents.
- To take any active role in iteration planning and release planning meetings.
- To ensure that team is working on the most valued requirement.
- To represent the voice of the customer.
- To accept the user stories that meet the definition of done and defined acceptance criteria.

#### Phases of Scrum Model :

#### Step 1: Product Backlog creation :
The PB is a list that consists of features that should be implemented during the Development process. It's ordered by priority wise and it's every item is called a ‘User Story’. Every User Story has or gets unique ID.

##### Ex :
|   ID.      |  User Story (Description) |
|------------|------------------------------|
| US154671   |  As a user icon created or add or delete the order.
| US186537   | Validate the data column which doesn't have any alphanumeric fields from customer data table.


#### Step 2: Sprint Planning and Sprint Backlog creation planning :
  Firstly, you should determine what your sprints duration will be a short, sprint allows you to release the working version of a product more frequently, as a result customer’s feedback will be received more often and all the possible bugs will be resolved in time.
As an alternative you can prefer a longer sprint duration, It will allow Developers to work more thoroughly the scrum team can select the most important User Stories from the Product Backlog.

#### Sprint Backlog :
  It consists of User Stories that will be completed during the current Sprint. The amount of these user stories depends on their duration in story points assigned to each user story during evaluation stage. This should be capable to finish all these User Stories on time.

#### Step 3: Working on the sprint Scrum meetings : 
  To track the current working process, a task board is commonly used. There are usually big cards with the names of particular User Story and a bundle of little sticky notes with the description of single tasks which are needed for implementation of this or that system.

|  USER STORIES  |	TO DO (TASKS) |	IN-PROGRESS  |	TESTING  |	DONE  |
|----------------|----------------|--------------|-----------|--------|
| US983721	     |#3, 6 |	7, 9 |	8 |	16, 17 |
| US636278	     |10, 11 |	12 |	13, 14 |	15 |
| US938283(New US) |	#19 |	#20 |	#22 |	#21 |

#### Step 4: Testing and product demonstration :

  Ideal result of every sprint is a working product, the full life cycle testing process is very important. The result of every sprint is product demonstration. The scrum team creates a review and demonstrates the results of their work on this basis the stakeholders take a decision about further project changes.

#### Step 5: Retrospective and next sprint Planning :

  Retrospectives main aim is to discuss the results and determine the ways how to improve Development process on the next step. The team should conclude ‘what went well’ during the working process and ‘what can be done better’ during the iteration. When the ways of improvement are defined the team can concentrate on the next sprint Planning.

#### Conclusion :
  These main distinctive features of Scrum are agility and continuous progress. It's provided mostly by permanent communication and close cooperation between the stakeholders at each step. At this phase of sprint Planning the PO communicates with the Scrum team, They define how they can divide the existing user story into several tasks.\
  \
  During the regular Scrum meetings, the team members can discuss the implementation of each particular task and the ways of solving possible problems. When the sprint is finished, the customer can evaluate the working product functionality at the current iteration. There is a possibility for him to arrive at a decision about further improvements or changes the initial projects paradigm. Finally, all information received during these steps can be used to improve the next sprint results, which helps optimize the development process in the best possible way.

#### _User Story’s Status process in Rally :_

#### User Story Status in Rally: (Rally – Test Management & Defect tracking Tool)
1.	**Grooming** (Initially created the User Story then Status is – Grooming)
2.	**Defined**  (Created multiple tasks under “User Story” with defined status then User Story status is changed to – Defined automatically).
     + **Note :** TASK’s Status standard process is “Defined” ▶️ “In-Progress”  ▶️ “Completed”.
3.	**In-Progress** (If any one of the task status has changed from “Defined” to “In-Progress” then User Story status is changed to “In-Progress” automatically)
4.	**Completed** (If all TASK’s status has changed to “Completed” Status then User Story Status is “Completed” automatically).
5.	**Accepted** (The US’s status is changed to accepted by PO).

#### SCRUM CEREMONIES or EVENTS :
1)	Sprint
2)	Sprint Planning
3)	Daily Scrum
4)	Sprint Review
5)	Sprint Retrospective.

#### SCRUM Values :
1)	Commitment 
2)	Courage
3)	Focus
4)	Openness
5)	Respect

#### Scrum Roles :
S.M - Scrum Master, 
P.O - Product Owner, 
DEV - DEV Team (DEV + QA).

#### Scrum Artifacts :
1)	P.B - Product Backlog
2)	S.B - Sprint Backlog
3)	P.I - Product Increment (PI).

#### Scrum Pillars :
1)	Transparency
2)	Inspection 
3)	Adoption

#### Story points – This is to Estimation hours of your allocated task. 
Story points assigned based on the Fibonacci series \
Fibonacci Series – 1, 2, 3, 5, 8, 13 ……. \
1 Story Point = 8 hours (As per the organizational standards) \
2 Story Point = 16 hours \
3 Story Point = 24 hours \
5 Story Point = 40 hours \
8 Story Point = 64 hours 


**Note :** As per the sprint wise working allocation hours 6.5 hrs per day (As per the Organizational Standards) \
1 Sprint = 10 business working days = 10*6.5 = 65 hours (Capacity).

### Ways of Testing :

1. Manual Testing.
2. Automation Testing.

**1. Manual Testing :** TC's are executing by manually or without any automation tool and find out the intent of defects or mismatch of the requirements is called Manual Testing.

**2. Automation Testing :** Testing is performed with the help of third-party tool or automation tool is called automation testing.

#### Testing Methodologies :
1. Black Box Testing 
2. White Box Testing 
3. Grey Box Testing

### Black Box Testing: (BB Testing)
The technique of testing without having technical knowledge of an application, specification-based testing technique is also known as BB or Input / Output driven testing techniques because they view the software as a BB with inputs and outputs.

#### Who will perform BB testing :
Testing team will perform the BB testing, the testers have no knowledge of how the system or component is structured inside the box. In BB testing the tester is concentrating on what the software does not, how does it?

#### How to perform the BB testing :
BB testing, also known as black box testing, encompasses both functional and non-functional testing. Functional testing focuses on assessing what the system does, including its features or functions. Non-functional testing evaluates aspects such as performance, usability, portability, and maintainability, among others.

#### Advantages :
1) well suited and efficient for large code segments.
2) Code access is not required.
3) Clearly separates user’s perspective from the Developers perspective through visibly defined roles.
4) Large number of moderately skilled testers can test the application with no knowledge of implementation, programming knowledge or Operating System.

#### Disadvantages :
1) Limited coverage since only a selected number of test scenarios are actually performed.
2) Inefficient testing due to the fact that the tester only has limited knowledge about an application.
3) Blind coverage since the tester can’t target specific code segments or error prone areas.
4) The TC's are different to design.

### BB Testing techniques :
1.	BVA: (Boundary Value Analysis)
2.	ECP (Equivalence class partition) or EP (Equivalence Partition)
3.	Error Guessing
4.	Decision table testing
5.	State transition testing
6.	UC testing (Use Case)
7.	All pairs testing And
8.	Orthogonal arrays testing

**Case study :** Successful enter the User ID(4-16ch) with alphanumeric. \
BVA (Size): Min Value = 4 & Max Value = 16. \
                      Min --> 4 char = pass \
                      Min-1 --> 3 char = fail \
                      Min+1 --> 5 char = pass \
                      Max-1 --> 15 char = pass \
                      Max+1 -->  17 = fail \
                      Max --> 16 char = pass \
                      \
ECP:       Valid.      Invalid
           a-z.         Special characters
           A-Z.         Blank
           0-9.         Spaces

Test Case Design techniques help us to identify whether the right input is selected or not.

#### Error Guessing :
In Error Guessing, we design the test cases by selecting inputs such that when these inputs are given to the application, the application should throw error.

#### Example of Error Guessing :
Let us assume there is an amount field in an application and the amount field should accept minimum value as 200 and the maximum value as 50,000.

So, using error guessing we will design test cases like:
-	When Value less than 200 is entered in the amount field then the application should throw an error.
-	When Value Greater than 50,000 is entered in the amount field then the application should throw an error.
-	When the decimal value (200.33) is entered in the amount field then the application should throw an error.
-	When Value is entered as $50 in the amount field then the application should throw an error.

#### Equivalence Partitioning :
  In Equivalence partitioning, we divide the input data of the software into a partition of equivalent data from which the test cases can be designed.

**Type 1 :** If the input is a range of value between A to B (5-12 characters) then design the test case by selecting one valid input and two invalid inputs. \
**Example :** Suppose there is a password field which accepts 5 to 12 characters, we will select one valid value as 6 and two invalid values as 4 and 13.

**Type 2 :** If the input is a set of values, then design the test case by selecting one valid value that belongs to set and one invalid value that does not belongs to the set. \
**Example :** Suppose there is a set of values as {116,120,140,150} then while designing test cases we will select one valid value as 120 which belongs to set and one invalid as 170 that does not belong to set.

**Type 3 :** If the input is the Boolean value, then select the test case for both true and false conditions. \
**Example :** Radio button, Checkbox.

#### Boundary Value Analysis :
If the input is a range of between A to B, then design the test case by selecting the value such as A, A+1, A-1 and B, B+1, B-1.

**Example :** There is an amount field which should accept amount greater than equal to 200 and amount less than equal to 50,000 so in this case, we will select input as {200,199,201} and {50000,50001,49999}

#### Conclusion :
Test case design technique allows you to design better test cases.

### White Box Testing : 
It is a Structure based testing technique and also known as WB testing or glass box testing technique, because here testers require knowledge of how the s/w is implemented and how it works.

**Who will perform WB Testing :** Developers use based structure techniques in component, integration testing, especially where there is good tool support for code-coverage.

**How to perform the WB Testing :**
WB testing is the detailed investigation of internal logic and structure of the code. WB testing is also called as glass box or open box testing.

#### There are 3 possible WB testing techniques
1. Execution Testing
2. Operation Testing
3. Mutation Testing

#### 1. Execution Testing :
#### a. Basic path coverage :
  Execution of all possible blocks in a program.
#### b. Loops Coverage :
  Termination of loop statements. (For loop, While loop, Do loop etc.,) 
#### c. Program Technique coverage : 
  There is need to be work on less memory or no memory cycles and CPU Cycles.
#### 2. Operation Testing: (Compatibility or Port Testing)
  Running the application on customer expected platforms. (OS compatibility & Browser Compatibility etc.,).
#### 3. Mutation Testing :
  Mutation refers to the deliberate alteration of a program. During mutation testing, WB (white-box) testers intentionally modify the program to assess test coverage. This process helps determine the adequacy of test coverage by evaluating how well the tests detect the changes introduced through mutations.

#### Advantages :
1. As the tester has knowledge of the source code, it becomes very easy to find out which type of data can help in testing the application effectively.
2. It helps in optimising the code.
3. Extra lines of code (LOC) can be removed which can bring in hidden defects.
4. Due to the tester's knowledge about the code maximum coverage is attained during the test scenario writing. 

#### Disadvantages :
1. Due to the fact that a skilled tester is needed to perform WB testing, the costs are increased. 
2. Sometimes it is impossible to look into every hook & corner to find out hidden errors that may create problems as may paths will go untested.
3. It is difficult to maintain WB testing as the use of specialized tools like code analysers and debugging tools are required.

### Grey Box Testing :
  GB testing is a technique to test the s/w product or application with partial of the internal workings of an application. In this process content specific errors that are related to web systems are commonly identified. It will increase the testing coverage by concentrating on all of the layers of any complex system.\
GB testing is combination of both WB testing and BB testing method.

**Who will perform the GB testing?**
  Unlike BB testing where the tester only tests the applications UI (User Interface), in Grey Box Testing the tester has access to design the documents and the DB having this knowledge. The User is able to better test data and test scenarios when making the test plan.

#### Advantages :
1. Offers combined benefits of BB and WB testing wherever possible.
2. GB testers don't rely on the source code instead they rely on interface definition and functional specifications.
3. Based on the limited information available, a Grey Box tester can design execute the test scenarios especially around communication protocols and data type handling.
4. The test is done from the point of view of the user and not the designer.

#### Disadvantages :
1. Since the access to source code is not available, the ability to go over the code and test coverage is limited.
2. The tests can be redundant if the s/w designer has already run a test case.
3. Testing every possible Input stream is unrealistic because it would take an unreasonable amount of time, therefore many program paths will go untested.


#### Difference between BB, GB & WB Testing :
**BB vs GB vs WB**

| BLACK BOX		|	GREY BOX		|	WHITE BOX |
|-------------|-------------|-----------|
|1. The internal workings of applications are not required to be known.|1. Somewhat knowledge of the internal workings are known.|1. Testers have full knowledge of internal workings of the application.|
|2. Also known as closed box testing, Data driven testing and functional testing.|2. Another term for GB testing is translucent testing, as the tester has limited knowledge of the insides of application. |2. Also known as clear box testing, structural testing or code-based testing.|
|3. Performed by end users and also by testers and developers.|3. Performed by end users and also by testers and developers.|3. Normally done by testers and developers.|
|4. Testing is based on external expectations; internal behaviour of the application is unknown.|4. Testing is done on the basis of high-level DB diagrams and data flow diagrams.|4. Internal workings are fully known and the tester can design test data accordingly.|
|5. This is the time consuming and exhaustive.|5. Partly time consuming and exhaustive.|5. The most exhaustive and time-consuming type of testing.|
|6. Not Suited to algorithm testing.|6. Not Suited to algorithm testing.|6. Suited for algorithm testing.|
|7. This is only be done by trial-and-error method.|7. Data domains and internal boundaries can be tested if known.|7. Data domains and internal boundaries can be better tested.|

