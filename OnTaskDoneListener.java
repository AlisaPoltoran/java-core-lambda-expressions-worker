package java_core.lambda_expressions.worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
