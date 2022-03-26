package MidTerm;

public class Camera {
    private String name;

    private Camera(){};
    private String getName(){
        return name;
    }
    private void setName(String name){
        this.name = name;
    }
    private static Camera instance;
    private static Object obj;
    private static Camera getInstance(){
        if (instance == null) {
            synchronized (obj) {
                if (instance == null) {
                    instance = new Camera();
                }
            }
        }
        return instance;
    };
}
