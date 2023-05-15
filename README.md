# FIZZ BUZZ solved using TDD
Solve Fizz buzz problem using tdd.

## TDD (Test Driven Development)
https://en.wikipedia.org/wiki/Test-driven_development

*Summary*
1. Add a test
2. Run all tests. The new test should fail for expected reasons
3. Write the simplest code that passes the new test
4. All tests should now pass
5. Refactor as needed, using tests after each refactor to ensure that functionality is preserved
6. Repeat

## The Problem
https://en.wikipedia.org/wiki/Fizz_buzz

*Tasks*
1. Use TDD process create an application that solve the problem.
   **NOTE:** USE THE REFACTOR STEPS TO IMPROVE YOU APPLICATION DESIGN.
2. If the input is a single position, print the corresponding value.
    ~~~
    value at position '<pos>' is: <value>
    ~~~
3. If the inputs are 2 positions, print the corresponding values between those position (including them)
    ~~~
    values between position1 <pos1> and position2 <pos2> are: <value1>, <value2>, ... 
    ~~~
4. If input is "all" <position>, print all the values until that position
    ~~~
    values up to position '<pos>' are: <value1>, <value2>, ...
    ~~~
