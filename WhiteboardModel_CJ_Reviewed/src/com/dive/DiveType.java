package com.dive;

/**
 * JR: use ALL_CAPS naming convention for the DiveType instances.
 *
 * Seems like you're trying to support both skydives and water dives here,
 * which doesn't seem appropriate, as (to me) they are fundamentally
 * different things, e.g., a skydive doesn't require decompression (to my knowledge),
 * a skydive has height, while a water dive has a depth - two very different properties.
 */
enum DiveType {
    sky,
    SCUBA,
    invalid
}