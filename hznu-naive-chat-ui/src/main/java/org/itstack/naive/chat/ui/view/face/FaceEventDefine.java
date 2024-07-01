package org.itstack.naive.chat.ui.view.face;

import javafx.scene.Node;

/**
 * hznu
 * @auther lxj
 *  
 */
public class FaceEventDefine {

    private FaceInit faceInit;

    public FaceEventDefine(FaceInit faceInit) {
        this.faceInit = faceInit;

        hideFace();
    }

    private void hideFace(){
        faceInit.root().setOnMouseExited(event -> {
            faceInit.hide();
        });
    }

}
