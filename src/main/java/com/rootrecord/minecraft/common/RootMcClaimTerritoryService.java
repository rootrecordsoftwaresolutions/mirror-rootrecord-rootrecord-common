package com.rootrecord.minecraft.common;

import java.util.UUID;

/**
 * Cross-plugin claim territory queries for RootClaims.
 * Territory is an unclaimed wilderness band outside the claim radius.
 */
public interface RootMcClaimTerritoryService {

    /** True when the block is inside a protected claim circle. */
    boolean isClaimed(String worldName, int blockX, int blockZ);

    /**
     * True when the player is claim owner or trusted on a claim whose territory band
     * (claim radius -> radius + buffer) covers this wilderness block.
     */
    boolean isWildernessFeeExempt(UUID playerId, String worldName, int blockX, int blockZ);

    /**
     * Credit a wilderness destroy fee to the claim bank whose territory covers this block.
     *
     * @return claim owner name when credited, otherwise {@code null} (caller should send to reserve)
     */
    String creditWildernessDestroyFee(
            String worldName, int blockX, int blockZ, double amountG, String payerName);

    /** Configured outward territory buffer in blocks (from claim edge). */
    int territoryBufferBlocks();
}
