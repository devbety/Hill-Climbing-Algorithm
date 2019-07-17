# Hill-Climbing-Algorithm
Steepest Descent Hill Climbing Algorithm implementation


Implement a steepest descent Hill Climbing algorithm to find the car specification with the best Gas per mile over weight ratio (mpg/wt)
Dataset: Motor Trend Car Road Tests (mtcars)

Description:
The data was extracted from the 1974 Motor Trend US magazine, and comprises fuel consumption and 10 aspects of automobile design and performance for 32 automobiles (1973–74 models).
A data frame with 32 observations on 11 (numeric) variables.

Attributes Format:
[, 1]	mpg	Miles/(US) gallon

[, 2]	cyl	Number of cylinders

[, 3]	disp	Displacement (cu.in.)

[, 4]	hp	Gross horsepower

[, 5]	drat	Rear axle ratio

[, 6]	wt	Weight (1000 lbs)

[, 7]	qsec	1/4 mile time

[, 8]	vs	Engine (0 = V-shaped, 1 = straight)

[, 9]	am	Transmission (0 = automatic, 1 = manual)

[,10]	gear	Number of forward gears

[,11]	carb	Number of carburetors

# Summary

A Hill climbing algorithm is a heuristic search which is used to determine the best node within a dataset resulting out to be the most efficient one according to a relation/mathematical calculation, in our case we will use steepest descent Hill Climbing algorithm to reach the solution within our data set. 

The data set provided, the data set consists attributes of 32 observations of cars which takes into account attributes such as fuel consumption, cylinders, displacement, power, weight and many more attributes adding up to 11 in total. We are going to divide the miles per gallon with the weight of the car (mpg/wt) and we are going to use the calculated values to reach to our solution.

# The Problem
As we have 32 observations 11 attributes associated with each observation, we are going to use the miles per gallon and divide it by the weight of each observation. This will return a value to us which we will use to compare the current node with the target node, and check if the target node is better or not and if it is better than the target node becomes the current node else the current nodes stays the same and is compared to another target node and the operation continues till one final value is reached.

#Algorithm
The steepest descent Hill Climbing algorithm:

Step 1: We choose a random node to start with and we set it as ‘current’

Step 2: We choose two random neighbouring nodes and set them as ‘target’

Step 3: If the current node is better than the target node, we keep the value in the current node same and choose a different random target node.

Step 4: If the target node is better than the current node, then we replace the value in the current node with the value in the target node

Step 5: We continue with Step 3 and 4 until we have a constant value in the current node which is not being replaced by a target node and thus we will reach our solution

#Data Structures
ArrayLists -> To store the values of the calculation for each and every car in the dataset 
