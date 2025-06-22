package annict.graphql.sample.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * An episode of a work
 */
public class Episode implements java.io.Serializable, Node {

    private static final long serialVersionUID = 1L;

    private int annictId;
    @jakarta.validation.constraints.NotNull
    private String id;
    private Episode nextEpisode;
    private Integer number;
    private String numberText;
    private Episode prevEpisode;
    private int recordCommentsCount;
    private RecordConnection records;
    private int recordsCount;
    private Double satisfactionRate;
    private int sortNumber;
    private String title;
    private boolean viewerDidTrack;
    private int viewerRecordsCount;
    @jakarta.validation.constraints.NotNull
    private Work work;

    public Episode() {
    }

    public Episode(int annictId, String id, Episode nextEpisode, Integer number, String numberText, Episode prevEpisode, int recordCommentsCount, RecordConnection records, int recordsCount, Double satisfactionRate, int sortNumber, String title, boolean viewerDidTrack, int viewerRecordsCount, Work work) {
        this.annictId = annictId;
        this.id = id;
        this.nextEpisode = nextEpisode;
        this.number = number;
        this.numberText = numberText;
        this.prevEpisode = prevEpisode;
        this.recordCommentsCount = recordCommentsCount;
        this.records = records;
        this.recordsCount = recordsCount;
        this.satisfactionRate = satisfactionRate;
        this.sortNumber = sortNumber;
        this.title = title;
        this.viewerDidTrack = viewerDidTrack;
        this.viewerRecordsCount = viewerRecordsCount;
        this.work = work;
    }

    public int getAnnictId() {
        return annictId;
    }
    public void setAnnictId(int annictId) {
        this.annictId = annictId;
    }

    /**
     * ID of the object.
     */
    public String getId() {
        return id;
    }
    /**
     * ID of the object.
     */
    public void setId(String id) {
        this.id = id;
    }

    public Episode getNextEpisode() {
        return nextEpisode;
    }
    public void setNextEpisode(Episode nextEpisode) {
        this.nextEpisode = nextEpisode;
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getNumberText() {
        return numberText;
    }
    public void setNumberText(String numberText) {
        this.numberText = numberText;
    }

    public Episode getPrevEpisode() {
        return prevEpisode;
    }
    public void setPrevEpisode(Episode prevEpisode) {
        this.prevEpisode = prevEpisode;
    }

    public int getRecordCommentsCount() {
        return recordCommentsCount;
    }
    public void setRecordCommentsCount(int recordCommentsCount) {
        this.recordCommentsCount = recordCommentsCount;
    }

    public RecordConnection getRecords() {
        return records;
    }
    public void setRecords(RecordConnection records) {
        this.records = records;
    }

    public int getRecordsCount() {
        return recordsCount;
    }
    public void setRecordsCount(int recordsCount) {
        this.recordsCount = recordsCount;
    }

    public Double getSatisfactionRate() {
        return satisfactionRate;
    }
    public void setSatisfactionRate(Double satisfactionRate) {
        this.satisfactionRate = satisfactionRate;
    }

    public int getSortNumber() {
        return sortNumber;
    }
    public void setSortNumber(int sortNumber) {
        this.sortNumber = sortNumber;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getViewerDidTrack() {
        return viewerDidTrack;
    }
    public void setViewerDidTrack(boolean viewerDidTrack) {
        this.viewerDidTrack = viewerDidTrack;
    }

    public int getViewerRecordsCount() {
        return viewerRecordsCount;
    }
    public void setViewerRecordsCount(int viewerRecordsCount) {
        this.viewerRecordsCount = viewerRecordsCount;
    }

    public Work getWork() {
        return work;
    }
    public void setWork(Work work) {
        this.work = work;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("annictId: " + GraphQLRequestSerializer.getEntry(annictId));
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (nextEpisode != null) {
            joiner.add("nextEpisode: " + GraphQLRequestSerializer.getEntry(nextEpisode));
        }
        if (number != null) {
            joiner.add("number: " + GraphQLRequestSerializer.getEntry(number));
        }
        if (numberText != null) {
            joiner.add("numberText: " + GraphQLRequestSerializer.getEntry(numberText));
        }
        if (prevEpisode != null) {
            joiner.add("prevEpisode: " + GraphQLRequestSerializer.getEntry(prevEpisode));
        }
        joiner.add("recordCommentsCount: " + GraphQLRequestSerializer.getEntry(recordCommentsCount));
        if (records != null) {
            joiner.add("records: " + GraphQLRequestSerializer.getEntry(records));
        }
        joiner.add("recordsCount: " + GraphQLRequestSerializer.getEntry(recordsCount));
        if (satisfactionRate != null) {
            joiner.add("satisfactionRate: " + GraphQLRequestSerializer.getEntry(satisfactionRate));
        }
        joiner.add("sortNumber: " + GraphQLRequestSerializer.getEntry(sortNumber));
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        joiner.add("viewerDidTrack: " + GraphQLRequestSerializer.getEntry(viewerDidTrack));
        joiner.add("viewerRecordsCount: " + GraphQLRequestSerializer.getEntry(viewerRecordsCount));
        if (work != null) {
            joiner.add("work: " + GraphQLRequestSerializer.getEntry(work));
        }
        return joiner.toString();
    }

    public static Episode.Builder builder() {
        return new Episode.Builder();
    }

    public static class Builder {

        private int annictId;
        private String id;
        private Episode nextEpisode;
        private Integer number;
        private String numberText;
        private Episode prevEpisode;
        private int recordCommentsCount;
        private RecordConnection records;
        private int recordsCount;
        private Double satisfactionRate;
        private int sortNumber;
        private String title;
        private boolean viewerDidTrack;
        private int viewerRecordsCount;
        private Work work;

        public Builder() {
        }

        public Builder setAnnictId(int annictId) {
            this.annictId = annictId;
            return this;
        }

        /**
         * ID of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setNextEpisode(Episode nextEpisode) {
            this.nextEpisode = nextEpisode;
            return this;
        }

        public Builder setNumber(Integer number) {
            this.number = number;
            return this;
        }

        public Builder setNumberText(String numberText) {
            this.numberText = numberText;
            return this;
        }

        public Builder setPrevEpisode(Episode prevEpisode) {
            this.prevEpisode = prevEpisode;
            return this;
        }

        public Builder setRecordCommentsCount(int recordCommentsCount) {
            this.recordCommentsCount = recordCommentsCount;
            return this;
        }

        public Builder setRecords(RecordConnection records) {
            this.records = records;
            return this;
        }

        public Builder setRecordsCount(int recordsCount) {
            this.recordsCount = recordsCount;
            return this;
        }

        public Builder setSatisfactionRate(Double satisfactionRate) {
            this.satisfactionRate = satisfactionRate;
            return this;
        }

        public Builder setSortNumber(int sortNumber) {
            this.sortNumber = sortNumber;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setViewerDidTrack(boolean viewerDidTrack) {
            this.viewerDidTrack = viewerDidTrack;
            return this;
        }

        public Builder setViewerRecordsCount(int viewerRecordsCount) {
            this.viewerRecordsCount = viewerRecordsCount;
            return this;
        }

        public Builder setWork(Work work) {
            this.work = work;
            return this;
        }


        public Episode build() {
            return new Episode(annictId, id, nextEpisode, number, numberText, prevEpisode, recordCommentsCount, records, recordsCount, satisfactionRate, sortNumber, title, viewerDidTrack, viewerRecordsCount, work);
        }

    }
}
