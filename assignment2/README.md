# Patient Queue Management System

## Project Overview
This project implements a patient queue management system using Java, demonstrating object-oriented programming principles and the use of priority queues. It models a healthcare facility's patient intake process, prioritizing patients based on urgency and age.

## Key Components

1. `Patient` (Class):
   - Represents individual patients in the system
   - Implements Comparable interface for priority queue ordering
   - Contains properties like name, age, condition, and urgency
   - Overrides compareTo() method for custom priority ordering

2. `PatientTester` (Main Class):
   - Manages the patient queue and user interface
   - Uses Java's PriorityQueue to maintain the patient order
   - Provides options to add patients, retrieve patients, and quit the program

## Key Features
- Priority queue implementation for efficient patient management
- Custom comparator for patient prioritization based on urgency and age
- Simple command-line interface for user interaction
- Encapsulation with private fields and public methods in the Patient class
- Use of Java's built-in PriorityQueue class for queue management

## Project Structure
- `Patient.java`: Defines the Patient class with all necessary attributes and methods
- `PatientTester.java`: Contains the main method and handles user interaction and queue operations

## Functionality
- Add new patients to the queue with details (name, age, condition, urgency)
- Retrieve patients from the queue based on their priority
- Automatic ordering of patients in the queue based on urgency and age
- Simple user interface for managing the patient queue

This project serves as a practical example of using priority queues in Java, demonstrating how to manage a dynamic list of patients in a healthcare setting based on custom priority rules.