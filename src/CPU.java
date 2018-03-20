public class CPU {

    /*
    MOS 6502 CPU (1.79 MHz)
    256B Stack
    16 bit address space
     */

    /*
    255 op codes

    String[] opcodes;
    opcodes = new String[0xFF];
    int number

    objects/classes

    CPU - (reg, opcodes, logic, flags,)
    memory - (logic, mapping, storage)
    ppu - (logic, rendering, data, buffering, mapping)
    apu - (logic, data, clock)
    loader - (file read, buffering, logic, )
    mapper  - (set of classes)
    renderer - graphic routines
    audio - (timers, sound chipsets, logic, data)
    gui - (graphic interface / logic)
    Utility (extra tools)


    find out the roms and handle for specific cases
    map out to different boards
     */

    // registers
    // http://wiki.nesdev.com/w/index.php/CPU_registers
    private int a, x, y, p, s, pc;

    // flags
    // http://wiki.nesdev.com/w/index.php/Status_flags
    private boolean carry, decimalMode, interrupt, disable, negative, overflow, zero;

    public final int INTERRUPT_PERIOD = 0;
    public final int INITIAL_PROGRAM_COUNTER = 0;
    public String[] opCodes;

    // initializes cpu state
    // http://wiki.nesdev.com/w/index.php/CPU_power_up_state
    public void init() {
        a = 0;
        x = 0;
        y = 0;
        p = 0x34;
        s = 0xFD;
        pc = 0;
    }


    public static void main(String[] args) {
        CPU c = new CPU();
        c.init();
        /*
        int counter = INTERRUPT_PERIOD; // number of cycles left til next suspected interrupt
        int programCounter = INITIAL_PROGRAM_COUNTER; // stores memory address of next op code
        Counter=InterruptPeriod;
        PC=InitialPC;

        for(;;)
        {
            OpCode=Memory[PC++];
            Counter-=Cycles[OpCode];

            switch(OpCode)
            {
                case OpCode1:
                case OpCode2:
                ...
            }

            if(Counter<=0)
            {
    /* Check for interrupts and do other */
    /* cyclic tasks here
    ...
                Counter+=InterruptPeriod;
                if(ExitRequired) break;
            }
        }
        */
    }

    // generates array of op codes and returns it

//    public static String[] opCodes() {
//
//    }

    /*
    cyclesTable

    need to create a cycles table detailing how long it takes for different assembly instructions to be run
     */


}
