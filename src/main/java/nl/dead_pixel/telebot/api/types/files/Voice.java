package nl.dead_pixel.telebot.api.types.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IFile;


/**
 * The type Voice.
 */
public class Voice implements IFile {
    @JsonProperty("file_id")
    private String fileId;
    private int duration;
    @JsonProperty("mime_type")
    private String mimeType;
    @JsonProperty("file_size")
    private int fileSize;

    /**
     * Gets file id.
     *
     * @return the file id
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * Sets file id.
     *
     * @param fileId the file id
     * @return the file id
     */
    public Voice setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * Gets duration.
     *
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets duration.
     *
     * @param duration the duration
     * @return the duration
     */
    public Voice setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Gets mime type.
     *
     * @return the mime type
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets mime type.
     *
     * @param mimeType the mime type
     * @return the mime type
     */
    public Voice setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    /**
     * Gets file size.
     *
     * @return the file size
     */
    public int getFileSize() {
        return fileSize;
    }

    /**
     * Sets file size.
     *
     * @param fileSize the file size
     * @return the file size
     */
    public Voice setFileSize(int fileSize) {
        this.fileSize = fileSize;
        return this;
    }
}
