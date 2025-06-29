
import java.util.Stack;


public class MSWord {
  private Stack<String> undoStack; 
  private Stack<String> redoStack;
  // constructor

  public MSWord(){
    this.undoStack = new Stack<>();
    this.redoStack = new Stack<>();

   }

  public void undo(){
if(!undoStack.isEmpty()){
  String element = redoStack.pop();
  undoStack.push(element);
}
  }

  public void redo(){
if(!undoStack.isEmpty()){
String element = undoStack.pop();
redoStack.push(element);
}
  }

  public void addWord(String word){
    this.undoStack.push(word);
  }
   
  public static void main(String[] args) {
    MSWord msword = new MSWord();
    msword.addWord("John");
    msword.addWord("Peter");
    msword.undo();
    System.out.println();

  }
}
