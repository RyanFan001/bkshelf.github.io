---
layout: default
title: SPMP
nav_order: 2
---

# Software Project Management Plan

{: .no_toc }

Looking for a minimal html version of this doc?

[Get it here](./html/spmp.html){: .btn .fs-3 .btn-purple }

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. TOC
{:toc}
</details>

---

## Overview

### Project Overview

Bookshelf is a web-based application that allows users to track and store the status of their collection of media content.

### Audience

Bookshelf is for individuals who desire an efficient way to track the neverending backlog of entertainment content. Users will be able to receive recommendations on books or television shows they are interested in. They will also be able to see the media content that their friends are interested in. This platform allows the user to explore new sections or topics of interest that they might not know anything about as well as stay updated with media they are involved in already.

### Scope

The scope of this project will be two-fold: act as a content-management system, and a recommendation system. The priority objective is to offer a seamless way to organize a collection of media, followed closely with the objective of discovering new and curated content for the user.

### Assumptions and Constraints

Bookshelf will focus on targeting mobile device users. Using modern web technologies with a mobile first design will allow for cross platform support and faster development while retaining user trust and expectations for native application patterns.

### Project Deliverables

| Deliverable                       | Deadline                  |
| :-------------------------------- | :------------------------ |
| Specifications                    | Friday, January 29, 2021  |
| SPMP                              | Friday, February 5, 2021  |
| Requirements                      | Friday, February 12, 2021 |
| Analysis                          | Friday, March 5, 2021     |
| Design                            | Friday, March 26, 2021    |
| Implementation/User Documentation | Friday, April 12, 2021    |

### Evolution of the Plan

The workflow pattern for maintaining the SPMP document will follow an integration branching flow with respect to the deliverable deadlines.

The single source of truth for the SPMP will be stored on a Google Document. All changes after the initial creation will be tracked in the “Authored by” changelog and follow the format of `<name> [YYYY-MM-DD]: <description of changes>`.

On every release (when a deliverable is completed), the changelog will reflect that a snapshot has been created with `<name> [YYYY-MM-DD]: snapshot-<semver numbering> for <name of deliverable>`. The snapshot of the SPMP will live in the project’s Git repository.

## Reference Materials

- [SPMP Outline](https://cs.uwaterloo.ca/~apidduck/se362/Assignments/A2/spmp)
- [IEEE Standard for Software Project Management Plan](https://bohr.wlu.ca/cp317/notes/IEEE_1058.pdf)

## Document Lexicon

### Definitions

**Friends**: Friends can be made by an individual by adding other users they know on bookshelf. They can also be able to see what their friends are currently interested in.

**My Bookshelf**: My Bookshelf contains the collection of media that is curated by the user. My bookshelf can track the status of ongoing media as well as suggest media based on the individual’s interests and likes.

**Registered User**: A user who has created an account and has logged in.

**User**: An individual who accesses the website.

**User Profile**: An individual’s directory of stored personal user settings and information related to the user. The personal profile provides functionality such as a list of tracking and storing media collections.

### Acronyms and Abbreviations

**API**: Application Program Interface. External software packages used in building this application.

**GUI**: Graphical User Interface. This is the interactive visual component for the software in which the user interacts. Ultimately consists of actions such as traditional buttons and information.

**SRS**: Software Requirements Specifications. This is the document which contains all requirements and the standard project management plan.

## Project Organization

### Organizational Structure

Members will be involved in every role, but will have a core responsibility for the ones selected below. (i.e. everyone will write documentation, but the designated documentation members will be in charge of putting it together.)

| Deliverable   | Group Members                              |
| :------------ | :----------------------------------------- |
| UI/UX         | Michael, Nick, Benjamin, Erica, Wei        |
| Documentation | Michael, Erica, Benjamin, Grant, Hayden    |
| Frontend      | Michael, Nick, Erica, Benjamin, Wei, Grant |
| Backend       | Runze, Wei, Grant, Hayden                  |
| Testing & SQA | Everyone                                   |

### Project Responsibilities

| Deliverable                       | Group Members                       |
| :-------------------------------- | :---------------------------------- |
| Specifications                    | Michael, Erica, Grant, Hayden, Nick |
| SPMP                              |                                     |
| Requirements                      |                                     |
| Analysis                          |                                     |
| Design                            |                                     |
| Implementation/User Documentation |                                     |

## Managerial Process

### Management Objectives and Priorities

The main objective of this project is to develop a mobile application that allows users to organize and track the various media content they consume, as well as to provide a list of recommendations based on their collection using a database. Our priority is to complete all deliverables and have a functional version of our application by the end of the term.

### Control Mechanisms

Weekly stand ups will take place on Thursdays to triage and process tasks for deliverables.

## Technical Process

### Methods, Tools, and Techniques

**Project management**: Discord, Trello, Google Docs

**Design**: Lucidchart, Draw.io, Figma

**Source code**: GitHub

### Verification and Validation Plan

Code will be tested by another member who did not write the code. All code that is not being edited should be verified and validated.

## Authors

| Name             | Date       | Description                                   |
| :--------------- | :--------- | :-------------------------------------------- |
| Michael Hoang    | 2021-01-27 |                                               |
| Hayden Coulter   | 2021-01-28 |                                               |
| Erica Ancajas    | 2021-01-28 |                                               |
| Nick Liu         | 2021-01-28 |                                               |
| Grant Westerholm | 2021-01-29 |                                               |
| Nick Liu         | 2021-01-29 | snapshot-0.1.0 for specifications deliverable |
| Michael Hoang    | 2021-01-29 | SQA                                           |
| Michael Hoang    | 2021-01-29 | snapshot-0.1.1 for minor html formatting      |
