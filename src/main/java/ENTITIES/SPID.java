package ENTITIES;

import java.sql.Timestamp;
public class SPID extends Base {
        public long id;
        public USER user;
        public status status = ENTITIES.status.PENDING;
        public String description;

    public SPID(long id, Timestamp created_at, Timestamp created_by, long id1, USER user, ENTITIES.status status, String description) {
        super(id, created_at, created_by);
        this.id = id1;
        this.user = user;
        this.status = status;
        this.description = description;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public USER getUser() {
        return user;
    }
    public void setUser(USER user) {
        this.user = user;
    }
    public ENTITIES.status getStatus() {
        return status;
    }
    public void setStatus(ENTITIES.status status) {
        this.status = status;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SPID{" +
                "id=" + id +
                ", user=" + user +
                ", status=" + status +
                ", description='" + description + '\'' +
                '}';
    }
}
