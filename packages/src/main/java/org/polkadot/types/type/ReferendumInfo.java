package org.polkadot.types.type;


import org.polkadot.types.Types;
import org.polkadot.types.codec.Struct;

/**
 * @name ReferendumInfo
 * @description Info regarding an ongoing referendum
 */
public class ReferendumInfo extends Struct {
    //  constructor (value?: ReferendumInfoValue | Uint8Array | Map<string, Codec>) {
    public ReferendumInfo(Object value) {
        super(new Types.ConstructorDef()
                        .add("end", BlockNumber.class)
                        .add("proposal", Proposal.class)
                        .add("threshold", VoteThreshold.class)
                        .add("delay", BlockNumber.class),
                value);
    }

    /**
     * @description When voting on this referendum will end
     */
    public BlockNumber getEnd() {
        return this.getField("end");
    }

    /**
     * @description The proposal being voted on
     */
    public Proposal getProposal() {
        return this.getField("proposal");
    }

    /**
     * @description The thresholding mechanism to determine whether it passed
     */
    public VoteThreshold getThreshold() {
        return this.getField("threshold");
    }

    /**
     * @description The delay (in blocks) to wait after a successful referendum before deploying
     */
    public BlockNumber getDelay() {
        return this.getField("delay");
    }

    public static class ReferendumInfoValue {
        BlockNumber end;
        Proposal proposal;
        VoteThreshold threshold;
        BlockNumber delay;
    }
}
