-- USERS
INSERT INTO users (id, name, email, password, role, specialization) VALUES
-- (1, 'Nagesh', 'admin@example.com', '$2a$10$FjIgU0Xh2VuIDSRUwI/jwO0dl6I09Rexf/84ykzkqLFN6tUQYOSrS', 'ADMIN', NULL),
 -- (2, 'John', 'staff1@example.com', '$2a$10$FjIgU0Xh2VuIDSRUwI/jwO0dl6I09Rexf/84ykzkqLFN6tUQYOSrS', 'STAFF', 'Electrician'),
 -- (3, 'Mary', 'staff2@example.com', '$2a$10$FjIgU0Xh2VuIDSRUwI/jwO0dl6I09Rexf/84ykzkqLFN6tUQYOSrS', 'STAFF', 'Plumber'),
 -- (4, 'Alice', 'user1@example.com', '$2a$10$FjIgU0Xh2VuIDSRUwI/jwO0dl6I09Rexf/84ykzkqLFN6tUQYOSrS', 'USER', NULL);

-- COMPLAINTS
INSERT INTO complaint (id, title, description, location, status, created_at, submitted_by_id) VALUES
(1, 'Light not working', 'Tube light in room 205 is not working.', 'Room 205', 'OPEN', NOW(), 4),
(2, 'Water leakage', 'Pipe leaking in bathroom.', 'Room 101', 'OPEN', NOW(), 4);

-- ASSIGNMENTS
INSERT INTO assignment (id, complaint_id, staff_id, assigned_at) VALUES
(1, 1, 2, NOW()),
(2, 2, 3, NOW());

-- STATUS_LOG
INSERT INTO status_log (id, complaint_id, status, updated_by, updated_at) VALUES
(1, 1, 'OPEN', 'System', NOW()),
(2, 2, 'OPEN', 'System', NOW());
