# Memo
File IO (Write and read memo)

##File I/O 
    Write two programs -- one to store multiple memos in a file and the second to retrieve multiple memos from the file.
    To create a new memo, allow a user to enter a topic and the text of a memo (the text of the memo is stored as a single line and thus cannot contain a return character). Store the topic, the date stamp of the memo, and the memo message.
    Creating a java.util.Date object with no arguments will initialize the Date object to the current time and date. A date stamp is obtained by calling the Date.toString() method.
    Either store the memos in the file using three lines -- the first line is the memo topic, the second line is the date stamp, and the third line is the memo message 
    OR
    Store the messages on one line using some type of character as the deliminter.
    To read multiple memos stored in a the file, display the memos one at a time, and allow the user to choose to view the next memo (if there is one).
    Use a JFileChooser dialog box to allow the user to choose the file from which the memos will be read from.
    You can use the showOpenDialog method to enable the user to select a file to open. This method returns either JFileChooser.APPROVE_OPTION, if the user has chosen a file, or JFileChooser.CANCEL_OPTION, if the user canceled the selection.
    If a file was chosen, then you call the getSelectedFile method to obtain a File object that describes the file. Here is a complete example:
    JFileChooser chooser = new JFileChooser();
    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
    {
       File selectedFile = chooser.getSelectedFile();
       Scanner in = new Scanner(selectedFile);
       . . .
    }
