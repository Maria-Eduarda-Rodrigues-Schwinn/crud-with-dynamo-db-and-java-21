package tech.buildRun.dynamoDb.entity;

import lombok.Setter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSortKey;
import tech.buildRun.dynamoDb.controller.ScoreDto;

import java.time.Instant;
import java.util.UUID;

@Setter
@DynamoDbBean
public class PlayerHistoryEntity {

    private String username;

    private UUID gameID;

    private Double score;

    private Instant createdAt;

    public static PlayerHistoryEntity fromScore(String username, ScoreDto scoreDto) {
        var entity = new PlayerHistoryEntity();
        
        entity.setUsername(username);
        entity.setGameID(UUID.randomUUID());
        entity.setScore(scoreDto.score());
        entity.setCreatedAt(Instant.now());

        return entity;
    }

    @DynamoDbAttribute("username")
    @DynamoDbPartitionKey
    public String getUsername() {
        return username;
    }

    @DynamoDbAttribute("game_id")
    @DynamoDbSortKey
    public UUID getGameID() {
        return gameID;
    }

    @DynamoDbAttribute("score")
    public Double getScore() {
        return score;
    }

    @DynamoDbAttribute("created_at")
    public Instant getCreatedAt() {
        return createdAt;
    }

}
