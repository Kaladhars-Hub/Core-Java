package Collections.List;

import java.util.*;

public class StackEx01 {

    public static void main(String[] args) {

        Stack<String> history = new Stack<>();

        history.push("Google");
        history.push("YouTube");
        history.push("GitHub");
        history.push("LinkedIn");

        System.out.println(history.peek());
        history.pop();
        System.out.println(history.peek());
        System.out.println(history.search("Google"));
        System.out.println(history.empty());
        System.out.println(history);
    }
}

/*

🟢 STACK-01 — Browser Back History

- Applying Stack's LIFO behavior

Imagine a browser that stores the pages you've visited.
When you press the Back button, the most recently visited page is removed from the history stack.

Requirements:
1. Create an empty Stack<String> named history.
2. Visit these pages in order: "Google", "YouTube", "GitHub", "LinkedIn". Store each page using the appropriate Stack method.
3. Display the current page without removing it.
4. Press Back once by removing the top page.
5. Display the current page again.
6. Find the position of "Google" using Stack's top-based search.
7. Check whether the Stack is empty using Stack's own method.
8. Print the final Stack.

 */