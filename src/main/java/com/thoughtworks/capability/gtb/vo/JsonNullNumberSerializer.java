package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class JsonNullNumberSerializer extends StdSerializer<Integer> {
    protected JsonNullNumberSerializer() {
        super(Integer.class);
    }

    @Override
    public void serialize(Integer integer, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeNumber(0);
    }
}
