package com.songmy.compiler;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;

import java.io.IOException;

import javax.annotation.processing.Filer;
import javax.lang.model.element.Modifier;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.SimpleAnnotationValueVisitor7;

/**
 * @author mysong
 * created on: 2018/10/19 16:50
 * description:
 */

public final class AppRegisterVisitor extends SimpleAnnotationValueVisitor7<Void, Void> {

    private Filer mFiler = null;
    private TypeMirror mTypeMirror = null;
    private String mPackageName = null;

    public void setFiler(Filer filer) {
        this.mFiler = filer;
    }

    @Override
    public Void visitString(String s, Void p) {
        mPackageName =s;
        return p;
    }

    @Override
    public Void visitType(TypeMirror typeMirror, Void p) {
        mTypeMirror = typeMirror;
        generateJavaCode();
        return p;
    }

    private void generateJavaCode(){
        final TypeSpec targetActivity = TypeSpec.classBuilder("AppRegister")
                .addModifiers(Modifier.PUBLIC)
                .addModifiers(Modifier.FINAL)
                .superclass(TypeName.get(mTypeMirror))
                .build();
        final JavaFile javaFile = JavaFile.builder(mPackageName + ".wxapi", targetActivity)
                .addFileComment("微信广播接收起")
                .build();

        try {
            javaFile.writeTo(mFiler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
