package org.example.rpg.models.map;

public class Cell {
    private Position pos;
    private ContentType currentContent;
    private ContentType oldContent;

    public ContentType getCurrentContent() {
        return currentContent;
    }

    public Position getPos() {
        return this.pos;
    }

    public void changeContent(ContentType newContent) {
        this.oldContent = this.currentContent;
        this.currentContent = newContent;
    }

    public void revertContent() {
        this.currentContent = this.oldContent;
        this.oldContent = ContentType.EMPTY;
    }

    public String toString() {
        return this.currentContent.sprite;
    }
}

