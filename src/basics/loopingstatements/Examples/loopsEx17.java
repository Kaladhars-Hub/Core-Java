package basics.loopingstatements.Examples;

public class loopsEx17 {

    public static void main(String[] args) {
        for(int i = 10; i >= 1; i = i-1) {
            System.out.println("Countdown: " + i);
        }
    }
}



/*

## 🔁 LOOP-17 — Countdown Timer

Now we're going to make the requirement a little different.

You want to display a countdown:

```text
Countdown: 10
Countdown: 9
Countdown: 8
Countdown: 7
...
Countdown: 1
```

 */