public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

//Basic recursion

//static returnType functionName(parameters) {
//
//    // 1. Base Case (Stopping condition)
//    if (baseCondition) {
//        return baseValue;   // or just return;
//    }
//
//    // 2. Work (process current state)
//
//    // 3. Recursive Call (smaller problem)
//    return functionName(smallerInput);
//}

//Void Recursion Template

//static void functionName(parameters) {
//
//    // Base Case
//    if (baseCondition) {
//        return;
//    }
//
//    // Work
//    doSomething();
//
//    // Recursive Call
//    functionName(smallerInput);
//}

/*
This is the template used for problems like:
    Subsets
    Permutations
    Backtracking
    Trees
    DFS
*/

/*
void recursion(parameters) {

    // Base Case
    if (goalReached) {
        saveAnswer();
        return;
    }

    // Try all possible choices
    for (choice in choices) {

        // Make a choice
        choose(choice);

        // Explore
        recursion(nextState);

        // Undo choice (Backtrack)
        undo(choice);
    }
}
*/

