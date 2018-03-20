public class Memory {

    /*
     Data=ReadMemory(Address1);  /* Read from Address1
    WriteMemory(Address2,Data); /* Write to Address2
     */

//    Paged Memory
//    The address space may be fragmented into switchable pages (aka banks). This is often done to expand memory when the address space is small (64kB).
//
//    Mirrored Memory
//    An area of memory may be accessible at several different addresses. For example, the data you write into location $4000 will also appear at $6000 and $8000. The ROMs may also be mirrored due to incomplete address decoding.
//
//            ROM Protection
//    Some cartridge-based software (such as MSX games, for example) tries to write into its own ROM and refuses to work if writing succeeds. This is often done for copy protection. To make such software work on your emulator, you should disable writes into ROM.
//
//            Memory-Mapped I/O
//    There may be memory-mapped I/O devices in the system. Accesses to such memory locations produce "special effects" and therefore should be tracked.

    public void readMemory() {

    }

    public int writeMemory() {
        return 1;
    }
}
