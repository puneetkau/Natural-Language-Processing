# Natural-Language-Processing
# Unit 6 - Natural Language Processing Project

## Introduction

Natural language processing (NLP) is used in many apps and devices to interact with users and make meaning of text to determine how to respond, find information, or to create new text. Your goal is to use natural language processing techniques to identify structure, patterns, and meaning in a text to have conversations with a user, execute commands, perform manipulations on the text, or generate new text.

## Requirements

Use your knowledge of object-oriented programming, ArrayLists, the String class, and algorithms to create a program that uses natural language processing techniques:

- **Create at least two ArrayLists** – Create at least two ArrayLists to store the data used in your program, such as data from text files or entered by the user.
- **Implement one or more algorithms** – Implement one or more algorithms that use loops and conditionals to find or manipulate elements in an ArrayList or String object.
- **Use methods in the String classs** - Use one or more methods in the String class in your program, such as to divide text into sentences or phrases.
- **Use at least one natural language processing technique** – Use a natural language processing technique to process, analyze, and/or generate text.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram

https://docs.google.com/drawings/d/1scSsE_l1qW2kS4A_ey88XWyPJ9HGBzP7Dm2mpu_iO1Q/edit?usp=sharing

## Video

I couldn't get this part to work again because YouTube wouldn't take my file type, but I can show you in class if you want.

## Project Description

Our project suggests hobbies to do inside or outside based on user preference. We created two ArrayLists that held a list of suggestions, outside and inside, and draw from those.

## NLP Techniques

Our program has a lot of user input. We processed the information in the ArrayLists by drawing the first word from each index to give the user a more simplified list of things to do if that was their preference. We did this through our printFirstWord method by creating a variable to store a space (" ") and then using the substring method from the String class to parse from (0, spaceIndex). 
