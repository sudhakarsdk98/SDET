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

#### Verification and Validation :

The process of evaluating work products (not the actual final product) of Dev Phase to determine whether they meet the requirements specified. Verification is done at the starting of the Dev process. It includes reviews, meetings, walkthroughs, inspection etc to evaluate documents, plans, code, requirements and specifications.    

<div align="center">
  <img src="https://github.com/sudhakarsdk98/SDET/assets/161011127/d6723e95-40f0-4727-8794-911893224e94" height="200" alt="Verification & Validation" />
  <img width="100" />
</div>


**Who will perform :** peers (Team members, Architect’s, Analysts).

#### Verification Techniques:
1) Reviews 2) inspection 3) walkthrough

**1)	Reviews :**  A review is a systematic examination of document by one or more people with the main aim of finding and removing errors early in the software development life cycle.
There are two types of reviews are held in verification. 
i)	Formal review        
ii)	Informal review

**Formal review :**
Formal review is following a formal process. It is well structured and regulated. It contains planning Kick-off, preparations, review meeting and rework.

**Informal review :**
Informal reviews are applied many times during the early stages of the life cycle of the document. A two persons team can conduct an informal review. The most important thing to keep in mind about the informal review is that they are not documented.

**Inspection :**
Inspection is a most formal form of reviews, a strategy adopted during static testing phase.
- it is a most formal review type.
- it is led by the trained moderators
- During inspection of the documents are prepared and checked thoroughly by the reviewers before the meeting.

**Walkthrough :**
A Walkthrough is conducted by document the author under of the review. Who takes the participants document and his or her thought process to achieve a common understanding and gather the feedback.

**Validation :**
The process of evaluating the software during or at the end of the development process to determine whether it's satisfies specified business requirements.

**Who will perform :**
Testing team, Dev team, client or BA team.


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

### Levels of Testing :
#### Component/unit --> Integration--> System--> Acceptance.


<div align="center">
  <img src="https://github.com/sudhakarsdk98/SDET/assets/161011127/9f498c1c-3cef-4a4f-b2ee-03fc1407cbb2" height="400" alt="Levels of Testing" />
  <img width="100" />
</div>


> In SDLC models there are defined phases like require coding or implementation, testing and deployment. Each phase goes through the testing. Hence there are various levels of Testing.

#### 1. Unit testing :
A unit is the smallest testable part of an application produces like functional interfaces. Unit testing is a method by which individual units of source code are tested to determine if they are fit for use.
Unit tests are basically written and executed by software to make sure that code meets its design and requirements and behaves as expected.

#### 2. Module/ Component testing :
Component testing is a method where testing of each is done separately. Suppose in an application there are 5 components, testing of each 5 components separately and efficiently is called a component testing. Component testing is done by testers.

#### 3. Integration testing :
After completion of dependent modules of development and testing programs combine them to form a system or application or build. In this integration they are conducting integration testing on the compiled modules w.r.to HLD’s. 

**There are 3 approaches to conduct the integration testing.**

##### a. Top Down approach :

<div align="center">
  <img src="https://github.com/sudhakarsdk98/SDET/assets/161011127/6f93482f-3e22-4c41-adbe-2ba74e1f4d1d" height="300" alt="Top Down approach" />
  <img width="100" />
</div>

In this approach testing is conducted on main module without conducting testing to some of sub modules, from above diagram a 'STUB' is a temporary program instead of under constructive sub module, it is also known as called program.

##### b. Bottom up approach :

<div align="center">
  <img src="https://github.com/sudhakarsdk98/SDET/assets/161011127/18ebcebd-9550-4474-b7c3-05e94c088fa9" height="300" alt="Bottom up approach" />
  <img width="100" />
</div>

In this approach testing is conducted on sub modules without conducting testing on main module. From above diagram a ‘DRIVER’ is a temporary program instead of the main module. It is also known as calling program.

##### C. Sandwich or Hybrid Approach :

<div align="center">
  <img src="https://github.com/sudhakarsdk98/SDET/assets/161011127/cde0a95b-3cbb-4ce5-947a-28953f2dbb19" height="300" alt="Sandwich or Hybrid Approach" />
  <img width="100" />
</div>

In this approach testing is conducted taking both Top-Down and Bottom-Up approaches.

**Application/Build/System :** A finally integrated all modules to set .EXE form file is called Build.

#### 4. System Testing :
Once all the components are integrated and evaluate system's compliance with its specified requirements. System testing is most often the final test to verify that the system to be delivered meets the specification.

#### 5. UAT : (User Acceptance Testing)
Acceptance testing is basically done to ensure specification requirements are met. Also known as “End user testing” and “Operational Acceptance Testing”. The acceptance is BlackBox testing which means UAT users aren’t aware of internal structure of the code. They just specify the input to the system and check whether systems respond with correct results.

- The goal of UAT testing is to establish confidence in the system.
- Acceptance testing is most often focused on a validation of testing.

**Organization management concentrate on UAT to collect feedback there are 2 approaches to conduct the testing.**

##### Alpha Testing :
It is done at the Developers site and implement at the end stage. It is conducted at the Developer's site by customer which is controlled environment.

##### Beta testing :
Beta testing is also known as user testing takes place at the end-user’s site by end users to validate the usability, functionality, compatibility and reliability testing. It's conducted at one or more customer’s site by end users, but environment can't be controlled by Developers.

**Who will perform the UAT ?** Acceptance testing is basically done by the user or customer although other stakeholders may be involved as well.

## Functional and Non-functional Testing :

### Functional Testing:  (System Testing or Black Box Testing or Build verification testing)
FT is a Testing technique that is used to test the features or functionality of the software.
> Testing the functionality of each and every component thoroughly or vigorously in an application against the requirement is called functional testing.

Example: Requirement by the customer for banking application 

1. Login:
1.1)	Username: It should be a 15-digits.
1.2)	Password: It should be a minimum of 8 and a maximum of 12 characters.

 2. Amount transfer:
2.1) To a/c no: It should be 12 digits a/c number.
2.2) Amount: It should accept a minimum of  $200 and a maximum of 50,000.              
2.3) Bank Name: It should be a valid bank name.

**Testing of the above requirement will look like this :**
1)	For login, Customer has given a requirement that username should be of 15 digits so we will test the functionality of username field by: 
-	Entering username less than 15 digits. (<15)
-	Entering username greater than 15 digits. (>15)
-	Entering alphanumeric characters in the username field.
-	Entering special characters in the username field.   
-	Entering 15-digits username. (=15)
-	Leaving the username field blank and proceeding further.   

2.	For the password field, the user has given a requirement that the password field should be minimum 8 and maximum 12 characters so we will test the functionality of the password field by:  
-	Enter a password of less than 8 characters.
-	Entering a password greater than 12 characters.
-	Entering the password of character size between 12 to 16.
-	Leave the password field blank and proceed.
-	Entering the password of 8 characters.
-	Enter a password of 12 characters.
-	Enter the Special characters in the password filed.
-	Password should be display in Protect mode.

3.	In Amount transfer for the account number field user has given a requirement that to account number should be of 12 digits so we will test the functionality of account number field by:
-	Entering account number less than 12 digits.
-	Entering account number greater than 12 digits.
-	Entering the account number of 12 digits.
-	Entering Alphanumeric characters.
-	Entering special characters.
-	Leaving the Account number field blank and proceeding further. 

4.	In amount transfer for the amount field, the user has given a requirement that amount should accept minimum $200 and maximum $50,000, so we will test the functionality of amount field by: 
-	Entering an amount less than 200.
-	Entering an amount greater than 50,000.
-	Entering an amount in decimal. (Eg: $200.14)
-	Entering the value which is between 200 and 50,000.
-	Leave the amount field blank and proceed further. 
-	Entering the amount with $ symbol.

5.	In amount transfer for bank name the user has given a requirement that bank name should be valid bank name, so we will test the functionality of bank name field by: 
-	Entering an invalid bank name.
-	Entering special characters in the bank name field.
-	Leaving the Bank name field as blank and proceed further.
-	Entering numeric values in the bank name field.
-	Enter the valid bank name.

### Smoke Testing:  
The smoke testing to Testing the basic functionality of the build or application declared as unstable and it is not tested any more until the smoke test of the build passes.

### Sanity Testing :
Sanity Testing it's a kind of software testing technique performed by the test team for some basic tests. The aim of basic test is to be conducted whenever new build is received for testing.

The terminologies such as smoke test or build validation test or basic Acceptance test or sanity tests are interchangeably used, however each one of them is used under a slightly different scenario.

Sanity test is usually unscripted helps to identified the dependent missing functionalities. It is used to determine if the section of the application is still working after a minor change. Sanity testing can be narrow and deep. Sanity test is a narrow regression test that the focuses on one or a few areas of functionalities.

### Re-Testing :
Retesting is executing a previously failed the test against the new software to check if the problem is resolved.

### Regression Testing :
Regression Testing is performed to verify if the build has not broken any other parts of the application by the recent code changes for defect fixing or for enhancement. The purpose of regression Testing is to verify that modifications in software or in the environment have not caused any unintended adverse side effects and the system still meets of the requirements.

### Exploratory Testing :
Testing of the software with any documents (TC's & Test planning) and identify the functionality of the application by exploring the application and learning the application they design the TC's and simultaneously execute them as well.

### Ad-hoc testing :
Testing of the application without any documentation to identify the functionality and perform the test execution based on application knowledge or experience.

### Baseline Testing :
Whenever the test team perform the test execution on application upgradation or migration with existing functionality of the application along with the snap shots is called “Baseline Testing”.

### Monkey testing :  (Gorilla Testing)
It's a software testing technique in which the testing system under test randomly. The input data that is used to test also generated randomly.

**What is Monkey Testing?**
In monkey testing, we randomly pick anyone feature and we somehow try to break it.
Using monkey testing we check whether the application or system is getting crashed when random input values/data are provided to the application.
In monkey testing, we do not write test cases and it's not mandatory for the tester to be aware of the full functionality of the application/system.


**Monkey Testing Characteristics :**
- Monkey testing is done when tester does not have time to write and execute test cases.
- Monkey testing is random so the tester may not be able to reproduce bug/error.
- In monkey testing, the tester should have good technical knowledge.

**Advantages of Monkey Testing :**
- Monkey testing can help us to find unique bugs.
- When all the test execution is completed, tester can switch to monkey testing that will allow quick fixing of defects.

### End to End Testing :
It is a methodology is used to test whether the flow of an application is performing as designed from start to finish. The purpose of carrying out E2E test is to identify system dependencies and to ensure that the right information is passed between various system components and systems.


**Difference between system testing and E2E testing :**
There is not really huge difference between the two, in some of establishments the terms could be used interchangeably everywhere is different.

**System Testing :**
You are testing the whole system i.e all of its components to ensure that each is functioning as intended. This is more from a functional side to check against the requirements.

**E2E testing :**
This is more about the actual flow through a system in more realistic end user scenario. Can a user navigate the application as expected and does it works? You are testing the work flow.


### Non-Functional Testing :
#### UI Testing (User Interface) :
GUI (Graphical User Interface) testing is checking the design of an application.

Ex. Required/Optional, fields alignment, lengths, process bars, scroll bars etc.,
 
#### Usability Testing :

In usability testing basically the testers tests ease with which the user interfaces can be used. It tests that whether the application is user friendly or not.

**Usability testing tests the following features of the software :**
- How easy it is to use the software?
- How easy is to learn the software?
- How convenient is the software to end user?

**What is Performance Testing?**
Testing the stability and response time of an application by applying load on it (Number of users) is called performance testing.

“Response time = Time is taken to send the request + Time taken to do the processing + Time taken to get the response back.”

**Load :** Total number of users accessing the application at a given point of time is called a load.

**Why performance testing?**
Feature in the software or application is not only important. An application performance like stability, response time, speed also plays an important role.
Performance testing is done to make sure software application is working properly in terms of speed, stability and scalability.
With the help of performance testing, we come to know things to improve before the application goes live in the market.
Without performance testing, our application will suffer from an issue like slow speed when many users are using the application simultaneously.

**Types of performance testing :**

#### Load Testing :
Testing the stability and response time of the application by applying load which is less than or equal to the number of users.
Stress Testing: Testing the stability and response time of the application by applying load more than the defined number of users and we keep applying load until the application crashes.

#### Volume Testing :
Here we transfer a huge volume of data from one location to another and then we check did this happened in the specified amount of time. To perform volume testing there are no ready-made tools available, we have to develop a script in order to perform volume testing.

#### Soak Testing : 
Testing stability and response time of application by applying load continuously (48 hours, 96 hours) for a particular period of time and make sure we do not exceed the number of defined users is called as soak testing.

#### Spike Testing :
Testing stability and response time of application by suddenly increase and decrease of the load to check the performance of the application is called spike testing.

**Most common performance problems :**
-	Long Load time: Load time should be kept to a minimum; users should not have to wait for too long for an application to start.
-	Poor response time: Response time should be very quick. If response time is not quick then the user has to wait for too long and the user will lose interest if this happens.

**Performance testing test case examples :**
-	Verify the response time when many users are using the website.
-	Verify maximum load (Number of users) an application or software can handle.
-	Verify the response of application when more than expected number of users using the application.
-	Verify the response time of application by suddenly increasing and decreasing the load.
-	Verify the response time of application by continuously applying the load for a particular period of time.

**Performance testing tools :**
**Neoload :** It is powerful performance testing software used for automating testing of API and load testing of applications.
**Load Ninja :** It is one of the best load testing tools. Load ninja provide us record and playback load test and run this test in real browsers at scale.
**Load Runner :** It is most popular load testing tool. Load runner helps us to test the performance of application under load. It helps us to simulate thousands of concurrent users to generate real-time load.
**Jmeter :** It is an open-source tool used for load testing as well as automating of API (Application program Interface). Jmeter helps us to analyse and measure the performance of web application. Also, Jmeter is platform independent.

#### Stress Testing :  
It is a form of testing that is used to determine the stability of a given system. Stress Testing involves testing beyond normal operational capacity often to a breaking point in order to observe the results. Stress Testing is a generic term used to describe the process of putting a system through stress.

#### Load testing :
Load testing is performed to determine system behaviour under both normal and at peak conditions. A load testing is usually conducted to understand the behaviour of the application under a specific expected load.

Ex. If the number of users are increased then how much CPU, Memory will be consumed, what is the network and bandwidth response time.

#### Performance testing :
Performance testing is testing that is performed to determine how fast some aspects of a system perform under a particular work load. It can serve different purposes like it can demonstrate that the system meets performance criteria.

#### Localisation Testing :
Localisation translates the product UI and occasionally changes some initial settings to make it suitable for another region. Localisation Testing checks the quality of the products, localisation for a particular target culture locate.

**The testing effort during localisation Testing focuses on**
- Areas affected by localisation testing such as UI and content.
- Culture / locale Specific, language specific and region specific.

#### Globalization Testing :
Globalization Testing is a testing process to check whether the software can perform in any locale or culture and functioning properly with all types of international Input's and steps to effectively make your product through global.

This type of testing validates whether the application is capable for using all over the world and to check whether Input's are accepts all languages text.

Ex: Zip code field in Sign-up form.
- for globalised it should allow to enter the alphanumeric inputs.
- for localised (India) it should allow to enter only numeric in Input field.

#### Security Testing :
Security Testing is basically to check that whether the application or product is secured or not.
Can anyone hack the system or login the application without any authentication? It is a process to determine that an information system protects data and maintain functionality as intended. Security Testing is related to the security of data and functionality of the application. You should be aware of the following concepts while performing the security Testing.
**1. Confidentiality :**
The application should provide the data to the relevant party.

Ex: One of the customer transactional data should not be visible to another customer; the irrelevant personal details of the customer should not be visible to the administrator and so on.

**2. Integrity :**
The data stored and displayed by the application should be correct. 

Ex: After a withdrawal the customer's account should be debited by the correct amount.

**3. Authentication :**
It should be possible to attribute the data transmitted in the application to either the application or customer in other words. No one other than the customer or the bank should be able to create or modify any data.

**4. Authorization :**
The application or a user should only be able to perform the tasks which they are respectively authorised to perform. 

Ex: A customer should not be able to withdrawal more than the balance in his account without having an overdraft facility. The application should be able to levy charges on customer account without prior customer.

**5. Availability :** The data and functionality should be available to the users throughout the working period.

Ex: if the banks operating timings are 8am to 8pm on all working days, it should be possible for a customer to access their account and make the necessary transactions on their account.

**6. Non-repudiation:**
At a later date it should not be possible for a party to deny that a particular transaction or data change took place.

Ex: if a customer withdrawal an amount from their account, this should trigger the relevant actions (posting to their transaction records, debiting their account and sending them be notification etc.)

#### Compatibility testing :
 This testing ensures compatibility of the application built with various other objects such other web browsers, hardware platforms, Operating Systems, etc.
 
Ex: Browser compatibility testing, OS compatibility testing.

#### Installation Testing :
Installation Testing is performed to ensure that all necessary components are installed properly and working as per the requirements of the s/w post installation. Installation process may include partial, full or upgrade install. 
#### Recovery Testing :
Recovery Testing is done in order to check how fast and better the application can recover after it has gone through type of crash or failure.


### STLC( Software or system testing life cycle) :

> STLC identifies what test activities to carry out and when to accomplish those test activities. Even though testing differs between organisations there is a Testing Life Cycle.

<div align="center">
  <img src="https://github.com/sudhakarsdk98/SDET/assets/161011127/d20f1545-3f1f-4dfd-b767-426e4afb6265" height="450" alt="STLC" />
  <img width="100" />
</div>

