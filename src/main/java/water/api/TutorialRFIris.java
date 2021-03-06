package water.api;

/**
 * Basic page introducing tutorial for Random Forest on Iris
 *
 * @author michal
 */
public class TutorialRFIris extends TutorialWorkflow {

  private final transient TutorWorkflow _wf;
  private final static String[][] TUTORIAL_STEPS = new String[][]{
    /*               Title     Short Summary     File containing step description */
    new String[] { "Step 1", "Introduction", "/tutorials/rf.iris/step1.html" },
    new String[] { "Step 2", "Dataset inhale", "/tutorials/rf.iris/step2.html" },
    new String[] { "Step 3", "Parsing the dataset", "/tutorials/rf.iris/step3.html" },
    new String[] { "Step 4", "Inspecting the dataset", "/tutorials/rf.iris/step4.html" },
    new String[] { "Step 5", "Building the model", "/tutorials/rf.iris/step5.html" },
    new String[] { "Step 6", "Inspecting the model", "/tutorials/rf.iris/step6.html" },
    new String[] { "Step 7", "Predict on a test set", "/tutorials/rf.iris/step7.html" },
    new String[] { "Step 8", "Scoring the prediction", "/tutorials/rf.iris/step8.html" },
  };

  public TutorialRFIris() {
    _wf = new TutorWorkflow("Random Forest Tutorial");
    int i = 1;
    for (String[] info : TUTORIAL_STEPS) {
      _wf.addStep(i++, new FileTutorStep(info));
    }
  }

  @Override
  protected TutorWorkflow getWorkflow() {
    return _wf;
  }
}
