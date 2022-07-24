package java_core.lambda_expressions.worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError (String result);
}
