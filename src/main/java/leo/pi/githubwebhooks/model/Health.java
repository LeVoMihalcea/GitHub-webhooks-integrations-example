package leo.pi.githubwebhooks.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter @Setter
public class Health implements Serializable {

    private int heartbeat;
    private LocalDateTime localDateTime;

    public Health(int heartbeat, LocalDateTime localDateTime) {
        this.heartbeat = heartbeat;
        this.localDateTime = localDateTime;
    }
}
