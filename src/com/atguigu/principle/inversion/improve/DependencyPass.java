package com.atguigu.principle.inversion.improve;

public class DependencyPass {
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(changHong);
    }
}

interface IOpenAndClose {
    void open(ITV tv);
}

interface ITV {
    void play();
}

class ChangHong implements ITV {
    
    @Override
    public void play() {
        System.out.println("长虹电视机。。打开");
    }
}

class OpenAndClose implements IOpenAndClose {

    @Override
    public void open(ITV tv) {
        tv.play();
    }
}

// interface IOpenAndClose {
//     void open();
// }
//
// interface ITV {
//     void play();
// }
//
// class OpenAndClose implements IOpenAndClose {
//
//     private ITV tv;
//     public OpenAndClose(ITV tv) {
//         this.tv = tv;
//     }
//
//     @Override
//     public void open() {
//         this.tv.play();
//     }
// }

// interface IOpenAndClose {
//     void open();
//     void setTv(ITV tv);
// }
//
// interface ITV {
//     void play();
// }
//
// class OpenAndClose implements IOpenAndClose {
//
//     private ITV tv;
//     public OpenAndClose(ITV tv) {
//         this.tv = tv;
//     }
//
//     @Override
//     public void setTv(ITV tv) {
//         this.tv = tv;
//     }
//
//     @Override
//     public void open() {
//         this.tv.play();
//     }
// }