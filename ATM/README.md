# ATM Simulator CLI – Java Practice Project

Welcome, budding Java developer! 👋 In this mini–project you will build a **command-line ATM simulator** consisting of two files: `ATMAccount.java` and `ATMSimulatorCLI.java`. By the end, you will have a tiny banking app you can run from any terminal – just like the software that powers real ATM machines (minus the money-spitting hardware).


---

## Why Build This?

* **Real-world relevance** – Every time you use an ATM, software very similar to this project is performing deposits, withdrawals, and balance checks.
* **OOP fundamentals** – Sharpen your skills with classes, objects, encapsulation, and simple error handling.
* **Instant feedback** – A CLI gives immediate input/output, so you can iteratively test each feature.

---
> **NOTE:** <br />
> We are using IntelliJ IDEA CE for this project, but you can use any Java IDE you prefer.

---

## Quick Demo

```bash
❯ javac ATMSimulatorCLI.java ATMAccount.java # compile the files
❯ java ATMSimulatorCLI # run the CLI
===== ATM Simulator =====
Enter account number (0 to exit): 
>>
```

---

## Step-by-Step Walkthrough

Below is a mentor-style roadmap. Treat each step like a checkpoint – compile and run after every change so bugs stay small and friendly.

<h3>Step 1:</h3>

In the system we're building, The ATM machine should be able to withdraw or deposit money.

**So here’s the question:**<br />
> ***How will the ATM understand whose money to withdraw from or whose money is it deposited to?***

>***It has to know the account of the user, without an account the user won't be able to use the ATM, even though there is a user interface that will tell the user to put the account number and withdraw the amount of money or want to deposit the money.***

>***So, how do you make an account that the ATM machine that will work on to withdraw or deposit the amount? Think of a way to do this.***

**Think about it like this:**<br />
> ***Before the ATM can give us money or even check our balance, it needs to know who we are and how much money we have. So how would you go about creating that account inside your program?***

<details>
  <summary>Hints</summary>
  <div style="padding: 1em; border-left: 3px solid #ccc; margin-top: 0.5em;">
    <ul>
      <li>
        <p><strong>✅ What you do:</strong> Declare a new class with private fields <code>accountNumber</code> and <code>balance</code>.</p>
      </li>
      <li>
        <p><strong>🏦 Real-world analogy:</strong> Think of a bank folder that stores a unique customer number and their current money tally.</p>
      </li>
      <li>
        <p><strong>💡 Tips:</strong> Mark fields <code>private</code> and add descriptive comments.</p>
      </li>
      <li>
        <p><strong>⚠️ Watch-outs:</strong> Forgetting <code>private</code> means anyone can modify <code>balance</code> directly – not good for security.</p>
      </li>
    </ul>
  </div>
</details>
<br />

---

<h3>Step 2:</h3>

Now that we’ve imagined the account, let’s actually build it with a way to store account info and use it inside the ATM system.

**So here’s the next question:**<br />
> ***How do we give this account a proper starting point — like a unique ID and an initial amount of money?***

>**We need a way to set up the account when it’s first created, and later retrieve its details when needed.**

>**In simple terms, we want to “open the account” with some basic details, just like we do at a real bank.**

**Think about it like this:**<br />

>**When you go to a bank, they ask for your name, give you an account number, and you might deposit your first amount. That’s what we’re mimicking here — a fresh start for a brand-new account.**

<details>
  <summary>Hints</summary>
  <div style="padding: 1em; border-left: 3px solid #ccc; margin-top: 0.5em;">
    <ul>
      <li>
        <p><strong>✅ What you do:</strong> Create a constructor inside your <code>ATMAccount</code> class that accepts an <code>accountNumber</code> and a starting <code>balance</code>.</p>
      </li>
      <li>
        <p><strong>🏦 Real-world analogy:</strong> Think of this like filling a form to open a bank account, where you get a new ID and make a first deposit.</p>
      </li>
      <li>
        <p><strong>💡 Tips:</strong> Use <code>this.accountNumber = accountNumber</code> to assign the value correctly inside the constructor.</p>
      </li>
      <li>
        <p><strong>⚠️ Watch-outs:</strong> Avoid common mistakes like <code>balance = balance;</code> — this doesn’t work the way you might think. Always use <code>this.balance</code>.</p>
      </li>
      <li>
        <p><strong>📤 Bonus:</strong> Add <code>getBalance()</code> and <code>getAccountNumber()</code> methods so your ATM can *ask* the account for its current info later on.</p>
      </li>
    </ul>
  </div>
</details>
<br />

---

<h3>Step 3:</h3>

Now that your account is set up with a balance and an ID, it’s time to let the user add money — just like putting cash into an ATM.

***So here’s the next question:***

>***How does the ATM know when the user is trying to deposit money, and how do we make sure the amount is valid?***

>***We don’t want the ATM to accept fake amounts, mistakes, or negative values. Only real, positive money should be added.***

>***So, how can we safely add money to an account and let the user know if it worked or not?***

***Think about it like this:***

>***Imagine you’re sliding bills into the ATM. If you try to insert Monopoly money or empty air, the ATM just says “Nope.” We need that same logic in our code.***

<details>
  <summary>Hints</summary>
  <div style="padding: 1em; border-left: 3px solid #ccc; margin-top: 0.5em;">
    <ul>
      <li>
        <p><strong>✅ What you do:</strong> Add a method called <code>deposit(double amount)</code> that increases the <code>balance</code> by the given amount — but only if the amount is greater than 0.</p>
      </li>
      <li>
        <p><strong>🏦 Real-world analogy:</strong> The ATM only accepts real bills. If the amount is less than or equal to zero, it quietly refuses to process it.</p>
      </li>
      <li>
        <p><strong>💡 Tips:</strong> Return a <code>boolean</code> value. This helps the user interface know whether to say “Deposit successful!” or “Invalid amount.”</p>
      </li>
      <li>
        <p><strong>⚠️ Watch-outs:</strong> Don’t compare doubles with <code>==</code>. Just check if <code>amount &gt; 0</code> to be safe.</p>
      </li>
      <li>
        <p><strong>🌟 Bonus:</strong> Print or return a message from the ATM like “₹100 deposited. New balance: ₹600.” for better feedback.</p>
      </li>
    </ul>
  </div>
</details>
<br />

---

<h3>Step 4:</h3>

Depositing money was easy — now it’s time for the more careful task: letting the user take money out of their account.

***So here’s the next question:***

>***How can we make sure the user can only withdraw money they actually have — and prevent errors like going into negative balance?***

>***We also don’t want to allow silly inputs like trying to withdraw zero or negative amounts. The ATM should be smart enough to say “Not allowed.”***

>***So, how do we safely subtract money from the account, but only when it makes sense to do so?***

***Think about it like this:***

>***An ATM doesn’t just hand out cash as soon as you press a button. It first checks if your balance is enough. If not, it gently denies the request and tells you why. Your code should behave the same way.***

<details>
  <summary>Hints</summary>
  <div style="padding: 1em; border-left: 3px solid #ccc; margin-top: 0.5em;">
    <ul>
      <li>
        <p><strong>✅ What you do:</strong> Create a method <code>withdraw(double amount)</code> that subtracts money *only if* the balance is enough and <code>amount &gt; 0</code>.</p>
      </li>
      <li>
        <p><strong>🏦 Real-world analogy:</strong> The ATM double-checks your balance before handing you the cash. If there’s not enough, it refuses — but politely.</p>
      </li>
      <li>
        <p><strong>💡 Tips:</strong> Return a <code>boolean</code> to show whether the withdrawal worked or failed. Let the calling code (like the command-line interface) handle friendly messages.</p>
      </li>
      <li>
        <p><strong>⚠️ Watch-outs:</strong> Don't update the balance *before* checking if there's enough money. Always validate first.</p>
      </li>
      <li>
        <p><strong>📉 Bonus:</strong> If withdrawal fails, return or print a message like “Insufficient balance. Current balance: ₹120.”</p>
      </li>
    </ul>
  </div>
</details>
<br />

---

<h3>Step 5:</h3>

Now that the user can deposit and withdraw money, the next useful thing is letting them see how much they have left in their account.

***So here’s the next question:***

>***How can the ATM show the user their current balance in a clear and readable way — like on a real ATM screen?***

>***Instead of just accessing the number directly, wouldn’t it be better to create a clean, consistent method that always displays the balance properly?***

***Think about it like this:***

>***After any transaction at the ATM, the screen usually flashes your new balance — neat, rounded, and formatted. Your code should do the same!***

<details>
  <summary>Hints</summary>
  <div style="padding: 1em; border-left: 3px solid #ccc; margin-top: 0.5em;">
    <ul>
      <li>
        <p><strong>✅ What you do:</strong> Create a method <code>displayBalance()</code> that uses <code>System.out.printf()</code> to show the balance with two decimal places.</p>
      </li>
      <li>
        <p><strong>🏦 Real-world analogy:</strong> It’s like the ATM screen that says: <em>“Your current balance is ₹547.25”</em>.</p>
      </li>
      <li>
        <p><strong>💡 Tip:</strong> Centralizing the display logic in one method keeps your output neat and consistent across all parts of your app.</p>
      </li>
      <li>
        <p><strong>📋 Bonus:</strong> Include a message like <code>"Current Balance: ₹%.2f"</code> so users feel like they're interacting with a friendly system.</p>
      </li>
    </ul>
  </div>
</details>
<br />

---

<h3>Step 6:</h3>

Now that your ATM account is fully functional, it’s time to simulate the actual ATM experience — where the user can interact with a menu to deposit, withdraw, and check balance again and again.

***So here’s the next question:***  

>***How do we keep the ATM “on” — always waiting for the next action, like a real ATM does at the bank?***

>***We want the user to be able to choose an option, perform an action, and then come back to the menu — unless they decide to quit.***

***Think about it like this:***

>***An ATM doesn’t shut down after one transaction. It shows a menu and lets you do as many things as you want — until you press “Exit.” Your code should feel just like that.***

<details>
  <summary>Hints</summary>
  <div style="padding: 1em; border-left: 3px solid #ccc; margin-top: 0.5em;">
    <ul>
      <li>
        <p><strong>✅ What you do:</strong> In your <code>main()</code> method (inside <code>ATMSimulatorCLI</code>), create an <code>ATMAccount</code> object, show a menu with numbered options (e.g. 1. Deposit, 2. Withdraw, 3. Balance, 4. Exit), and keep looping using <code>while (true)</code> or a condition.</p>
      </li>
      <li>
        <p><strong>🏦 Real-world analogy:</strong> It’s the ATM’s home screen, ready for the next customer or the next tap.</p>
      </li>
      <li>
        <p><strong>💡 Tips:</strong> Use a <code>Scanner</code> to read user input. A <code>switch</code> statement can help route the correct action based on the number the user chooses.</p>
      </li>
      <li>
        <p><strong>⚠️ Watch-outs:</strong> Don’t forget to close the <code>Scanner</code> when the user exits the program — it's good practice to release system resources.</p>
      </li>
      <li>
        <p><strong>🧠 Bonus:</strong> After each action, pause and ask the user to press Enter to continue — this improves the user experience and readability.</p>
      </li>
    </ul>
  </div>
</details>
<br />

---

<h3>Step 7:</h3>

Now that the ATM shows a menu, it’s time to actually make the buttons work — connecting what the user chooses to the real banking operations you’ve built.

***So here’s the next question:***

>***What should happen when a user presses 1 to deposit? Or 2 to withdraw? Or 3 to check balance?***

>***Each menu option needs to trigger the right method on the user’s account, and the system should respond clearly so the user knows what happened.***

***Think about it like this:***

>***Pressing a button on an ATM isn’t just visual — it triggers something inside: money moves, balance changes, or information is shown. You’re now wiring those “internal gears.”***

<details>
  <summary>Hints</summary>
  <div style="padding: 1em; border-left: 3px solid #ccc; margin-top: 0.5em;">
    <ul>
      <li>
        <p><strong>✅ What you do:</strong> Inside your <code>switch</code> statement or menu handler, call the appropriate method on your <code>ATMAccount</code> object:
          <ul>
            <li><code>deposit(amount)</code> when the user picks deposit</li>
            <li><code>withdraw(amount)</code> when they choose to withdraw</li>
            <li><code>displayBalance()</code> for balance inquiry</li>
            <li><code>System.exit(0)</code> or break the loop for exit</li>
          </ul>
        </p>
      </li>
      <li>
        <p><strong>🏦 Real-world analogy:</strong> It’s like connecting the ATM’s physical buttons to the machine’s banking software — so pressing "Withdraw ₹100" actually deducts ₹100.</p>
      </li>
      <li>
        <p><strong>💡 Tip:</strong> Always confirm back to the user — e.g., “✅ ₹200 deposited successfully” or “❌ Not enough funds.” Users appreciate feedback like ATM receipts.</p>
      </li>
      <li>
        <p><strong>⚠️ Watch-outs:</strong> Be careful with user input. If they type letters instead of numbers, your program might crash. Use <code>hasNextDouble()</code> to check before reading amounts, or wrap with <code>try/catch</code>.</p>
      </li>
      <li>
        <p><strong>🧠 Bonus:</strong> Add small delays (<code>Thread.sleep()</code>) or line dividers to simulate a real ATM experience!</p>
      </li>
    </ul>
  </div>
</details>
<br />

---

<h3>Step 8:</h3>

Your ATM app is almost complete — but before launching it into the world, you need to test everything like a quality assurance (QA) team would.

***So here’s the final question:***

>***What happens if a user tries to deposit ₹0? Or withdraw a negative amount? Or types something that isn’t even a number?***

>***Real users make mistakes — and real ATMs are designed to handle them calmly and clearly. Can your program do the same?***

***Think about it like this:***

>***Before any ATM is installed in a bank, engineers run hundreds of tests on it — trying to break it. You’re now the engineer for your virtual ATM.***

<details>
  <summary>Hints</summary>
  <div style="padding: 1em; border-left: 3px solid #ccc; margin-top: 0.5em;">
    <ul>
      <li>
        <p><strong>✅ What you do:</strong> Try all sorts of edge cases in your app:
          <ul>
            <li>Deposit or withdraw <code>0</code> or negative values</li>
            <li>Withdraw more than the current balance</li>
            <li>Type a letter or symbol instead of a number</li>
            <li>Enter an invalid menu option (like 7 or -1)</li>
          </ul>
        </p>
      </li>
      <li>
        <p><strong>🏦 Real-world analogy:</strong> Think like a tester trying to break an ATM before it ever reaches a customer — catch the bugs first!</p>
      </li>
      <li>
        <p><strong>💡 Tips:</strong> Use log messages like <code>“❌ Invalid input. Please enter a number greater than 0.”</code> so the user understands what went wrong.</p>
      </li>
      <li>
        <p><strong>⚠️ Common mistake:</strong> After reading numbers using <code>nextInt()</code> or <code>nextDouble()</code>, always call <code>nextLine()</code> to clear the input buffer — or your <code>Scanner</code> might behave unexpectedly next time.</p>
      </li>
      <li>
        <p><strong>🧠 Bonus:</strong> Add a confirmation prompt when the user chooses "Exit" — like <code>“Are you sure? (Y/N)”</code> to make the experience more interactive.</p>
      </li>
    </ul>
  </div>
</details>
<br />

---

## Common Errors & Fixes

| Error message | Likely cause | Quick fix |
|---------------|-------------|-----------|
| `java.util.InputMismatchException` | User typed letters where `double` expected | Use `scanner.hasNextDouble()` before reading or catch the exception and prompt again. |
| `Cannot access private field balance` | Trying to use `account.balance` directly | Call `getBalance()` or create a public method inside `ATMAccount`. |
| `symbol not found: Scanner` | Forgot import | Add `import java.util.Scanner;` at the top of `ATMSimulatorCLI.java`. |
| `Exception in thread "main" java.lang.NumberFormatException` | Parsing string to number without validation | Wrap `Double.parseDouble()` in a `try/catch`. |
| Balance becomes negative after withdrawal | Validation logic missing | Before subtracting, check `amount <= balance`. |

---

## Bonus Extension Ideas

- **Multiple accounts** – Store a `Map<Integer, ATMAccount>` and let users “insert” different cards.
- **PIN authentication** – Add security before transactions.
- **Persistence** – Save balances to a file or small database so money survives program restarts.
- **Unit tests** – Use JUnit to ensure deposits and withdrawals never misbehave.
- **GUI upgrade** – Swing or JavaFX for a windowed ATM.

---

## You Got This! 🚀

Every successful software engineer started with tiny projects just like this one. Celebrate each bug you squash – it means you learned something new today. Keep iterating, keep experimenting, and most importantly **have fun**. The ATM world (and the real one) awaits your next creation!
