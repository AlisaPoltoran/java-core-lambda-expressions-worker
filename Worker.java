package java_core.lambda_expressions.worker;

public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker (OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }


    public void start () {
        for (int i = 1; i < 10; i++) {
            if (i == 7) {
                errorCallback.onError("Completion of task " + i + " is failed");
            }
            callback.onDone("Task " + i + " is done");
        }
    }
}
