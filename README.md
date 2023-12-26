<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Decryption Module for Encryption2</title>
</head>
<body>

    <h1>Decryption Module for Encryption2</h1>

    <h2>Overview</h2>
    <p>
        The "decrypt" Java program serves as the decryption counterpart to Encryption2, enabling users to reverse the Caesar cipher encryption applied to text. This module prompts users to input the encrypted text and the original shift value, producing the decrypted text as output.
    </p>

    <h2>How to Use</h2>
    <ol>
        <li><strong>Compile:</strong></li>
        <code>javac decrypt.java</code>

        <li><strong>Run:</strong></li>
        <code>java decrypt</code>

        <li><strong>Follow prompts:</strong></li>
        <ul>
            <li>Enter the encrypted text obtained from the Encryption2 output.</li>
            <li>Enter the original shift value used for encryption.</li>
        </ul>

        <li><strong>Output:</strong></li>
        <p>The program will display the decrypted text based on the specified shift value.</p>
    </ol>

    <h2>Example</h2>
    <pre>
        <code>
Enter the encrypted text: Wklv lv d whvw phvvdjh.
Enter the shift value: 3
Decrypted Text: This is a test message.
        </code>
    </pre>

    <h2>Notes</h2>
    <ul>
        <li>Ensure that the encrypted text corresponds to the output of the Encryption2 program.</li>
        <li>The shift value must match the one used during the encryption process for accurate decryption.</li>
    </ul>

    <p>
        Feel free to integrate this decryption module into your projects or use it as a standalone tool for decrypting text encrypted with a Caesar cipher.
    </p>

</body>
</html>
